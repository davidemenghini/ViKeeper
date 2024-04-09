package it.davidemenghini.ViServer.Model.Service;

import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import it.davidemenghini.ViServer.Model.Repository.AnimeSeriesRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnimeService {

    @Autowired
    private AnimeSeriesRepo animeSeriesRepo;

    private final Logger logger = LoggerFactory.getLogger(AnimeService.class);

    //@Transactional
    public Boolean addNewSeries(String name){
        Series animeSeries = new Series();
        animeSeries.setName(name);
        return this.addNewSeries(animeSeries);
    }

    private Boolean execAddNewSeries(Series s){
        try{
            this.animeSeriesRepo.save(s);
            return Boolean.TRUE;
        }catch (Exception e){
            this.logger.error("There is a problem with anime series repo!");
            this.logger.error("The error is: "+e);
            return Boolean.FALSE;
        }
    }

    public Boolean addNewSeries(Series series){
        System.out.println(series.toString());
        return this.execAddNewSeries(series);
    }

    public List<Series> getSeriesByName(String name,int pageNumber, int pageSize){
        Pageable p = Pageable
                .ofSize(pageSize)
                .withPage(pageNumber);
        Page<Series> i = this.animeSeriesRepo.findByNameContaining(p,name);
        return i.stream().toList();
    }

    public long getSeriesCount(){
        return this.animeSeriesRepo.count();
    }

}
