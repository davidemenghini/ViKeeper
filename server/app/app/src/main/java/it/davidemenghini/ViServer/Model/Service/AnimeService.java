package it.davidemenghini.ViServer.Model.Service;

import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import it.davidemenghini.ViServer.Model.Repository.AnimeSeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {

    @Autowired
    private AnimeSeriesRepo animeSeriesRepo;

    //@Transactional
    public void addNewSeries(String name){
        Series animeSeries = new Series();
        animeSeries.setName(name);
        try{
            this.animeSeriesRepo.save(animeSeries);
        }catch (Exception e){
            throw new RuntimeException("There is a problem with anime series repo!");
        }
    }

}
