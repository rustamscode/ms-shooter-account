package shooter.msshooteraccount.service;

import shooter.msshooteraccount.web.dto.request.LoadoutFilterRq;
import shooter.msshooteraccount.web.dto.response.LoadoutInfoRs;

import java.util.Set;

public interface LoadoutService {

  Set<LoadoutInfoRs> getLoadouts(final LoadoutFilterRq loadoutInfoRq);
}
