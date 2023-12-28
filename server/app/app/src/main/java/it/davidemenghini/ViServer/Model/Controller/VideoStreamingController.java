package it.davidemenghini.ViServer.Model.Controller;

import it.davidemenghini.ViServer.Model.Service.VideoStreamingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class VideoStreamingController {


    @Autowired
    private VideoStreamingService videoStreamingService;
    private Logger logger = LoggerFactory.getLogger(VideoStreamingController.class);

    @GetMapping(path = "/api/video/getVideo", produces = MediaType.ALL_VALUE)
    public Mono<Resource> getVideo(@RequestHeader(value = "Range") String range){
        logger.error("range: "+ range);

        return videoStreamingService.getVideo();

    }


}
