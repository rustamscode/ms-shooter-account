package shooter.msshooteraccount.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shooter.msshooteraccount.exception.UserNotFoundException;
import shooter.msshooteraccount.mapper.UserMapper;
import shooter.msshooteraccount.persistance.entity.User;
import shooter.msshooteraccount.persistance.repository.UserRepository;
import shooter.msshooteraccount.service.UserService;
import shooter.msshooteraccount.web.dto.response.UserInfoRs;

import java.util.UUID;

import static shooter.msshooteraccount.util.ExceptionMessageUtil.USER_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Override
  public UserInfoRs getUserById(final UUID id) {
    final User user = userRepository.findById(id)
        .orElseThrow(() -> new UserNotFoundException(String.format(USER_NOT_FOUND, id)));

    return userMapper.mapToUserInfoRs(user);
  }
}
