package it.davidemenghini.ViServer.Model.EntityPojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "season")
public class Season {

    @Id
    @Column(name = "idSeason")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSeason;


    @Column(name="idSeries")
    private UUID idSeries;




}
