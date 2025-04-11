package shooter.msshooteraccount.web.controller.impl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shooter.msshooteraccount.service.LoadoutService;
import shooter.msshooteraccount.web.controller.LoadoutController;
import shooter.msshooteraccount.web.dto.request.LoadoutFilterRq;
import shooter.msshooteraccount.web.dto.response.LoadoutInfoRs;
import shooter.msshooteraccount.web.dto.response.ResponseDto;

import java.util.Set;

import static org.springframework.http.HttpStatus.OK;
import static shooter.msshooteraccount.util.ResponseMessageUtil.LOADOUTS_FOUND;

@RestController
@RequiredArgsConstructor
public class LoadoutControllerImpl implements LoadoutController {

  private final LoadoutService loadoutService;

  @Override
  public ResponseDto<Set<LoadoutInfoRs>> getLoadouts(final @Valid LoadoutFilterRq request) {
    return ResponseDto.build(LOADOUTS_FOUND, OK, loadoutService.getLoadouts(request));
  }
}
