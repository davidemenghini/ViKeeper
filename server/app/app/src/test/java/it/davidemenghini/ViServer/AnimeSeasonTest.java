package it.davidemenghini.ViServer;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.davidemenghini.ViServer.Model.Controller.AnimeController;
import it.davidemenghini.ViServer.Model.EntityPojo.Series;
import it.davidemenghini.ViServer.Model.Repository.AnimeSeriesRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Objects;
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AnimeSeasonTest {


    private MockMvc mockMvc;

    @Mock
    private AnimeSeriesRepo animeSeriesRepo;

    @InjectMocks
    @Autowired
    private AnimeController animeController;

    private JacksonTester<Series> jacksonTester;


    @BeforeEach
    public void setup(){
        JacksonTester.initFields(this,new ObjectMapper());
        this.mockMvc = MockMvcBuilders.standaloneSetup(new AnimeController())
                .build();
    }

    @Test
    public void tryTest(){
        System.out.println("yessss");
    }

}
