package it.davidemenghini.ViServer.Model.Repository;

import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AnimeSeriesRepo extends CrudRepository<Series, UUID>, PagingAndSortingRepository<Series,UUID> {

    /**
     * This method allow you to find all anime series by name.
     * @param pageable The pageable object that allow you to get only some of these series.
     * @param name The name of the Series.
     * @return A page object that contain
     */
    Page<Series> findByNameContaining(Pageable pageable, String name);
}
