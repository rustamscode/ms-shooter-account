package shooter.msshooteraccount.web.dto.request;

import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.util.UUID;

@Getter
@Builder
public class LoadoutFilterRq {

  @Nullable
  private UUID userId;

}
