package it.davidemenghini.ViServer.AnimeFinder;

import it.davidemenghini.ViServer.Model.Repository.SeasonRepo;
import org.checkerframework.checker.compilermsgs.qual.CompilerMessageKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

//@Component
public class DefaultAnimeFileSystemFinder implements FileVisitor<Path> {


    private Path path;

    private final Path defaultPath = Path.of("D:\\anime\\");


    private final Set<AnimeSeason> seasonSet = new LinkedHashSet();




    private String actualSeriesName;

    @Autowired
    private SeasonRepo seasonRepo;

    private final Logger logger = LoggerFactory.getLogger(DefaultAnimeFileSystemFinder.class);

    public DefaultAnimeFileSystemFinder(String path){
        if (path.isEmpty()){
            this.path = this.defaultPath;
        }else{
            this.path = Path.of(path);
        }
    }
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        logger.info(dir.toString());
        if (dir.getFileName().startsWith("season_S")){
            this.addNewSeason(dir.getFileName());
        }else{
            this.createNewSeries(dir.getFileName(),"");
        }
        return FileVisitResult.CONTINUE;
    }

    private void createNewSeries(Path fileName,String info) {

    }

    private void addNewSeason(Path fileName) {

    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        logger.info(file.toString());
        String fileName = file
                .getFileName()
                .toString();
        String fullpath = file
                .toString();
        AnimeEpisode
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return null;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return null;
    }
}
