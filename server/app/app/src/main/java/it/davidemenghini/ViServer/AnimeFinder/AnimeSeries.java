package it.davidemenghini.ViServer.AnimeFinder;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AnimeSeries {


    private String path;


    private String name;


    private List<AnimeSeason> seasons;



}
