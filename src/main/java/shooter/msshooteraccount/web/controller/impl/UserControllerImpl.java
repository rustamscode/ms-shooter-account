package shooter.msshooteraccount.web.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import shooter.msshooteraccount.service.UserService;
import shooter.msshooteraccount.web.controller.UserController;
import shooter.msshooteraccount.web.dto.response.ResponseDto;
import shooter.msshooteraccount.web.dto.response.UserInfoRs;

import java.util.UUID;

import static shooter.msshooteraccount.util.ResponseMessageUtil.USER_FOUND;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

  private final UserService userService;

  @Override
  public ResponseDto<UserInfoRs> getUserById(final UUID id) {
    return ResponseDto.build(String.format(USER_FOUND, id), HttpStatus.OK, userService.getUserById(id));
  }
}
