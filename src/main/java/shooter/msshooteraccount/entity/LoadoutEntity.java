package shooter.msshooteraccount.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Table(name = "loadouts")
@Entity
public class LoadoutEntity extends BaseEntity {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "primary_weapon")
  private WeaponEntity primaryGun;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "secondary_weapon")
  private WeaponEntity secondaryGun;
}
