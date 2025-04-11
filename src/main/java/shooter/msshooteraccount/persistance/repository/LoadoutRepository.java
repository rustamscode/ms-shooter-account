package shooter.msshooteraccount.persistance.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shooter.msshooteraccount.persistance.entity.Loadout;

import java.util.Set;
import java.util.UUID;

@Repository
public interface LoadoutRepository extends JpaRepository<Loadout, UUID> {

  @Query("""
      SELECT l FROM Loadout l 
      WHERE l.user.id = :userId
      """)
  @EntityGraph(attributePaths = {
      Loadout.Fields.user,
      Loadout.Fields.primaryGun,
      Loadout.Fields.secondaryGun},
      type = EntityGraph.EntityGraphType.FETCH)
  Set<Loadout> getLoadoutsByUserId(@Param("userId") UUID userId);
}
