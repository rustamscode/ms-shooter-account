package shooter.msshooteraccount.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import shooter.msshooteraccount.persistance.entity.Loadout;
import shooter.msshooteraccount.web.dto.response.LoadoutInfoRs;

@Mapper(componentModel = "spring", uses = {WeaponMapper.class})
public abstract class LoadoutMapper {

  @Mapping(target = "primaryGun", source = "primaryGun")
  @Mapping(target = "secondaryGun", source = "secondaryGun")
  public abstract LoadoutInfoRs mapToLoadoutInfoRs(Loadout loadout);
}
