package it.davidemenghini.ViServer.Model.Service;

import it.davidemenghini.ViServer.AnimeFinder.AnimeSeries;
import it.davidemenghini.ViServer.Model.Repository.AnimeSeriesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {

    @Autowired
    private AnimeSeriesRepo animeSeriesRepo;

    //@Transactional
    public void addNewSeries(String name){
        AnimeSeries animeSeries = new AnimeSeries();
        animeSeries.setName(name);
        try{
            this.animeSeriesRepo.save(animeSeries);
        }catch (Exception e){
            throw new RuntimeException("There is a problem with anime series repo!");
        }
    }

}
