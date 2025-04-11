package shooter.msshooteraccount.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import shooter.msshooteraccount.web.dto.request.LoadoutFilterRq;
import shooter.msshooteraccount.web.dto.response.LoadoutInfoRs;
import shooter.msshooteraccount.web.dto.response.ResponseDto;

import java.util.Set;

@Tag(name = "Loadout management API")
@RequestMapping("/loadouts")
public interface LoadoutController {

  @GetMapping
  @Operation(summary = "Find loadouts by filter")
  ResponseDto<Set<LoadoutInfoRs>> getLoadouts(final LoadoutFilterRq request);
}
