package it.davidemenghini.ViServer.AnimeFinder;


import it.davidemenghini.ViServer.Model.EntityPojo.Episode;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AnimeSeason {


    private String name;

    private String path;

    private List<AnimeEpisode> episodes;


}
