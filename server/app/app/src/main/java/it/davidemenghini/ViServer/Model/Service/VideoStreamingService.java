package it.davidemenghini.ViServer.Model.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class VideoStreamingService {
    private static final String path = "D:\\aaa.mp4";

    @Autowired
    private ResourceLoader resourceLoader;

    private Logger logger = LoggerFactory.getLogger(VideoStreamingService.class);

    public Mono<Resource> getVideo(){
        logger.info("Ciaoooo");

        return Mono.fromSupplier(()->this.resourceLoader.getResource(path));
    }
}
