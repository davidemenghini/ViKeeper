package it.davidemenghini.ViServer.Model.Repository;

import it.davidemenghini.ViServer.Model.EntityPojo.Episode;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EpisodeRepo extends CrudRepository<Episode, UUID> {
}
