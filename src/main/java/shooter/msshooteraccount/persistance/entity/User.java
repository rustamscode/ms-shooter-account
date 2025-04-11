package shooter.msshooteraccount.persistance.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)

@Table(name = "users")
@Entity
public class User extends BaseEntity {

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  @Column(name = "in_selection", nullable = false)
  private Boolean inSelection;

  @ToString.Exclude
  @JoinColumn(name = "user_id")
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Loadout> loadouts;
}
