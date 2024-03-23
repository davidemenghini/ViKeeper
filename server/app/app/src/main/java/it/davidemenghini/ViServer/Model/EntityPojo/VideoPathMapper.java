package it.davidemenghini.ViServer.Model.EntityPojo;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


/**
 * This entity represents a video mapper for Hls streaming.
 * This class will help you to retrieve path of video (or a part of the video).
 */
@Data
@Entity
@Table(name = "VideoPathMapper")
public class VideoPathMapper {

    @Id
    @Column(name = "idVideoMapper")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idVideoMapper = UUID.randomUUID();

    @Column(name = "videoPath")
    private String videoPath;

}
