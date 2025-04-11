package shooter.msshooteraccount.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

@Slf4j
@Component
public class StartupMessageRunner implements CommandLineRunner {

  @Value("${files.path.startup-message}")
  private String messagePath;

  @Override
  public void run(String... args) throws Exception {
    String message = Files.newBufferedReader(Path.of(messagePath))
        .lines()
        .collect(Collectors.joining("\n"));

    log.info(message);
  }
}
