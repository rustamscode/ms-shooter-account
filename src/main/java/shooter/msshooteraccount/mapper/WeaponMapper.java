package shooter.msshooteraccount.mapper;

import org.mapstruct.Mapper;
import shooter.msshooteraccount.persistance.entity.Weapon;
import shooter.msshooteraccount.web.dto.response.WeaponInfoRs;

@Mapper(componentModel = "spring")
public abstract class WeaponMapper {

  protected abstract WeaponInfoRs mapToWeaponInfoRs(Weapon weapon);
}
