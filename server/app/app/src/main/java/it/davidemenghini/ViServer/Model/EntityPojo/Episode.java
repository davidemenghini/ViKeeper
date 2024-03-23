package it.davidemenghini.ViServer.Model.EntityPojo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
public class Episode implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idEpisode")
    private UUID idEpisode;


    @Column(name="idSeason")
    private UUID idSeason;
}
