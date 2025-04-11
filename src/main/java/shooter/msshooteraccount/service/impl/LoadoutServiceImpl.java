package shooter.msshooteraccount.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shooter.msshooteraccount.mapper.LoadoutMapper;
import shooter.msshooteraccount.persistance.repository.LoadoutRepository;
import shooter.msshooteraccount.service.LoadoutService;
import shooter.msshooteraccount.web.dto.request.LoadoutFilterRq;
import shooter.msshooteraccount.web.dto.response.LoadoutInfoRs;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoadoutServiceImpl implements LoadoutService {

  private final LoadoutMapper loadoutMapper;

  private final LoadoutRepository loadoutRepository;

  public Set<LoadoutInfoRs> getLoadouts(final LoadoutFilterRq request) {
    return loadoutRepository.getLoadoutsByUserId(request.getUserId())
        .stream()
        .map(loadoutMapper::mapToLoadoutInfoRs)
        .collect(Collectors.toSet());
  }
}
