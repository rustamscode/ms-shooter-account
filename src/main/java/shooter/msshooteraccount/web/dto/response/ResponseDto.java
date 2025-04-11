package shooter.msshooteraccount.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseDto<T> {
  private String message;
  private HttpStatus status;
  private T data;

  public static <T> ResponseDto<T> build(String message, HttpStatus status, T data) {
    return new ResponseDto<T>(message, status, data);
  }

}
