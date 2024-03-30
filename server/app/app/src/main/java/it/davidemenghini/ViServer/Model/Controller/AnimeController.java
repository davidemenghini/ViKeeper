package it.davidemenghini.ViServer.Model.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    @PostMapping("/add")
    public @ResponseBody Boolean addNewAnime(@RequestParam String name){
        return Boolean.FALSE;
    }

}
