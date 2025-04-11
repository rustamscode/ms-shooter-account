package shooter.msshooteraccount.web.dto.response;

import lombok.Builder;
import lombok.Getter;
import shooter.msshooteraccount.enums.WeaponType;

import java.math.BigDecimal;
import java.time.Duration;

@Getter
@Builder
public class WeaponInfoRs {

  private String name;
  private WeaponType type;
  private Duration duration;
  private BigDecimal maxSpray;
  private Integer totalAmmoCount;
  private BigDecimal damage;
  private Integer ammoInMac;

}
