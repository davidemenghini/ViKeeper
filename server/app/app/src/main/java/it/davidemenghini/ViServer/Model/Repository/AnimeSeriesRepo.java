package it.davidemenghini.ViServer.Model.Repository;

import it.davidemenghini.ViServer.AnimeFinder.AnimeSeries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AnimeSeriesRepo extends CrudRepository<AnimeSeries, UUID> {
}
