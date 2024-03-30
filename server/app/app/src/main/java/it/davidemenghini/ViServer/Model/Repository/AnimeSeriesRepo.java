package it.davidemenghini.ViServer.Model.Repository;

import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AnimeSeriesRepo extends CrudRepository<Series, UUID> {
}
