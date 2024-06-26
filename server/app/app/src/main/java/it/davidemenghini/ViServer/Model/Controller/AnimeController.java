package it.davidemenghini.ViServer.Model.Controller;

import com.google.gson.Gson;
import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import it.davidemenghini.ViServer.Model.Service.AnimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private final Gson gson = new Gson();

    @Autowired
    private AnimeService animeService;

    private final Logger logger = LoggerFactory.getLogger(AnimeController.class);



    @PostMapping("/add")
    public ResponseEntity<Boolean> addNewAnime(@RequestBody String name){
        Series s = gson.fromJson(name, Series.class);
        this.logger.info(s.toString());
        return new ResponseEntity<>(animeService.addNewSeries(s), HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getSeriesCount(){
        return new ResponseEntity<>(animeService.getSeriesCount(),HttpStatus.OK);
    }

    @PostMapping("/find")
    public ResponseEntity<List<Series>> findAllSeriesByName(@RequestBody String containing,@RequestBody int pageNumber, @RequestBody int pageSize){
        if(((long) pageNumber * pageSize) >= this.animeService.getSeriesCount()){
            return new ResponseEntity<>(List.of(),HttpStatus.BAD_GATEWAY);
        }
        List<Series> series = this.animeService.getSeriesByName(containing,pageNumber, pageSize);
        return new ResponseEntity<>(series,HttpStatus.OK);
    }

    



}
