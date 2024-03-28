package it.davidemenghini.ViServer;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.davidemenghini.ViServer.AnimeFinder.AnimeSeries;
import it.davidemenghini.ViServer.Model.Controller.AnimeController;
import it.davidemenghini.ViServer.Model.Repository.AnimeSeriesRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
public class AnimeSeasonTest {


    private MockMvc mockMvc;

    @Mock
    private AnimeSeriesRepo animeSeriesRepo;

    @Mock
    private AnimeController animeController;

    private JacksonTester<AnimeSeries> jacksonTester;


    @BeforeEach
    public void setup(){
        JacksonTester.initFields(this,new ObjectMapper());
        this.mockMvc = MockMvcBuilders.standaloneSetup(animeController)
                .build();
    }

    @Test
    public void tryTest(){
        System.out.println("yessss");
    }

}
