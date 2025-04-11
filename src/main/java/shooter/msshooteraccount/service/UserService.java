package shooter.msshooteraccount.service;

import shooter.msshooteraccount.web.dto.response.UserInfoRs;

import java.util.UUID;

public interface UserService {

  UserInfoRs getUserById(final UUID id);
}
