package it.davidemenghini.ViServer.Model.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class VideoStreamingService {
    private static final String FORMAT = "classpath:videos\\bbb.mp4";

    @Autowired
    private ResourceLoader resourceLoader;

    private final Logger logger = LoggerFactory.getLogger(VideoStreamingService.class);
/*
    public Mono<Resource> getVideo(){
        try{
            return Mono.fromSupplier(()->this.resourceLoader
                    .getResource(FORMAT));
        }catch (Exception e){
            logger.error("ma esiste per davvero? "+this.resourceLoader.getResource(FORMAT).exists());
            return Mono.empty();
        }



    }*/
}
