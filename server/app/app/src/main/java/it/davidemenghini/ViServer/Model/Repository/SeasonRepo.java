package it.davidemenghini.ViServer.Model.Repository;

import it.davidemenghini.ViServer.Model.EntityPojo.Season;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SeasonRepo extends CrudRepository<Season, UUID> {
}
