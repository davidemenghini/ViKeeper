package it.davidemenghini.ViServer.AnimeFinder;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class LinearAnimeContainer implements AnimeContainer{

    private final Set<AnimeSeason> animeSeasonSet = new LinkedHashSet<>();

    private final Set<AnimeEpisode> animeEpisodeSet = new LinkedHashSet<>();

    private final Set<AnimeSeries> animeSeriesSet = new LinkedHashSet<>();




    @Override
    public boolean addNewSeason(AnimeSeason animeSeason) throws RuntimeException {
        try {
            this.animeSeasonSet.add(animeSeason);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public boolean addNewEpisode(AnimeEpisode animeEpisode) throws RuntimeException {
        try {
            this.animeEpisodeSet.add(animeEpisode);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean addNewSeries(AnimeSeries animeSeries) throws RuntimeException {
        try {
            this.animeSeriesSet.add(animeSeries);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<AnimeSeries> searchAnimeSeries(Predicate<AnimeSeries> predicate) {
        return this.animeSeriesSet
                .parallelStream()
                .filter(predicate)
                .toList();
    }

    @Override
    public List<AnimeSeason> searchAnimeSeason(Predicate<AnimeSeason> predicate) {
        return this.animeSeasonSet
                .parallelStream()
                .filter(predicate)
                .toList();
    }

    @Override
    public List<AnimeEpisode> searchAnimeEpisode(Predicate<AnimeEpisode> predicate) {
        return this.animeEpisodeSet
                .parallelStream()
                .filter(predicate)
                .toList();
    }
}
