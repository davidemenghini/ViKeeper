package it.davidemenghini.ViServer.Model.EntityDao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Table(name = "HlsVideoMapper")
/**
 * This entity represents a video mapper for Hls streaming.
 * This class will help you to retrieve path of video (or a part of the video).
 */
public class HlsVideoMapper {

    @Id
    @Column(name = "idVideoMapper")
    private UUID idVideoMapper = UUID.randomUUID();

    @Column(name = "videoPath")
    private String videoPath;

}
