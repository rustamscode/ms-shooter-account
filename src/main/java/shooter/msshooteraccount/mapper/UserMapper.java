package shooter.msshooteraccount.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import shooter.msshooteraccount.persistance.entity.User;
import shooter.msshooteraccount.web.dto.response.UserInfoRs;

@Mapper(componentModel = "spring", uses = {LoadoutMapper.class})
public abstract class UserMapper {

  @Mapping(target = "id", source = "id")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "isActive", source = "isActive")
  @Mapping(target = "inSelection", source = "inSelection")
  @Mapping(target = "loadouts", source = "loadouts")
  public abstract UserInfoRs mapToUserInfoRs(User user);
}
