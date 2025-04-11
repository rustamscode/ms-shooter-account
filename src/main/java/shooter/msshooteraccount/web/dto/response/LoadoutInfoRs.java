package shooter.msshooteraccount.web.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoadoutInfoRs {

  private WeaponInfoRs primaryGun;
  private WeaponInfoRs secondaryGun;

}
