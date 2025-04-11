package shooter.msshooteraccount.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import shooter.msshooteraccount.enums.WeaponType;

import java.math.BigDecimal;
import java.time.Duration;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)

@Table(name = "weapons")
@Entity
public class Weapon extends BaseEntity {

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Enumerated(EnumType.STRING)
  @Column(name = "type", nullable = false)
  private WeaponType type;

  @Column(name = "duration", nullable = false)
  private Duration duration;

  @Column(name = "max_spray", nullable = false)
  private BigDecimal maxSpray;

  @Column(name = "total_ammo_count", nullable = false)
  private Integer totalAmmoCount;

  @Column(name = "damage", nullable = false)
  private BigDecimal damage;

  @Column(name = "ammo_in_mac", nullable = false)
  private Integer ammoInMac;
}


