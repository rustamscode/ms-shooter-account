package shooter.msshooteraccount.persistance.entity;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@FieldNameConstants
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class BaseEntity implements Serializable {

  @Id
  @EqualsAndHashCode.Include
  @UuidGenerator(style = UuidGenerator.Style.RANDOM)
  @Column(name = "id", nullable = false, unique = true, updatable = false)
  private UUID id;

  @Column(name = "created_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;

  @Column(name = "last_modified_date", nullable = false)
  @UpdateTimestamp
  private LocalDateTime lastModifiedDate;

  @Column(name = "is_deleted", nullable = false)
  private Boolean isDeleted = false;

  @Version
  @Column(name = "version", nullable = false)
  private Integer version;
}
