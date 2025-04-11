package shooter.msshooteraccount.web.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
public class UserInfoRs {

  private UUID id;
  private String name;
  private Boolean isActive;
  private Boolean inSelection;
  private List<LoadoutInfoRs> loadouts;

}
