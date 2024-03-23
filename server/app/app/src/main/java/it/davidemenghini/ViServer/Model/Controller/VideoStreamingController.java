package it.davidemenghini.ViServer.Model.Controller;

import it.davidemenghini.ViServer.Model.Service.VideoStreamingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class VideoStreamingController {



    @Autowired
    private VideoStreamingService videoStreamingService;
    private final Logger logger = LoggerFactory.getLogger(VideoStreamingController.class);

    @GetMapping(value = "/api/video/getVideo", produces = "video/mp4")
    public Mono<Resource> getVideo(@RequestHeader(value = "Range") String range){
        logger.info("range: "+ range);
        Mono<Resource> r = videoStreamingService.getVideo();

        if (!r.equals(Mono.empty())){
            return r;
        }else{
            logger.error("errorerererer");
            return Mono.empty();
        }


    }


}
