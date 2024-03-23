package it.davidemenghini.ViServer.Model.EntityPojo;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "series")
public class Series implements Serializable {

    @Id
    @Column(name = "idSeries")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSerires;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "idSeries")
    private List<Season> seasons;

}
