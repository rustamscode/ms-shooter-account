package shooter.msshooteraccount.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shooter.msshooteraccount.web.dto.response.ResponseDto;
import shooter.msshooteraccount.web.dto.response.UserInfoRs;

import java.util.UUID;

@Tag(name = "User management API")
@Validated
@RequestMapping("/users")
public interface UserController {

  @GetMapping("/{id}")
  @Operation(summary = "Find user by id")
  ResponseDto<UserInfoRs> getUserById(final @PathVariable(name = "id") @NotNull UUID id);
}
