package it.davidemenghini.ViServer.AnimeFinder;

import java.util.List;
import java.util.function.Predicate;

public interface AnimeContainer {


    /**
     * This method allow you add a season into container.
     * @param animeSeason An anime season.
     * @return True if no exceptions are raised.
     */
    boolean addNewSeason(AnimeSeason animeSeason) throws RuntimeException;


    boolean addNewEpisode(AnimeEpisode animeEpisode) throws RuntimeException;


    boolean addNewSeries(AnimeSeries animeSeries) throws RuntimeException;


    List<AnimeSeries> searchAnimeSeries(Predicate<AnimeSeries> predicate);


    List<AnimeSeason> searchAnimeSeason(Predicate<AnimeSeason> predicate);

    List<AnimeEpisode> searchAnimeEpisode(Predicate<AnimeEpisode> predicate);





}
