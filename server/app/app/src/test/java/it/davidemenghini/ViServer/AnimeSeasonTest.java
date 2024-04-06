package it.davidemenghini.ViServer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import it.davidemenghini.ViServer.Model.EntityPojo.Series;

import java.util.Objects;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class AnimeSeasonTest {


    private MockMvc mockMvc;

    @Mock
    private AnimeSeriesRepo animeSeriesRepo;

    Gson gson = new Gson();

    @InjectMocks
    @Autowired
    private AnimeController animeController;

    private JacksonTester<Series> jacksonTester;


    private Series getSeries(){
        Series s = new Series();
        s.setName("seriesTest");
        return s;
    }


    @BeforeEach
    public void setup(){
        JacksonTester.initFields(this,new ObjectMapper());
        this.mockMvc = MockMvcBuilders.standaloneSetup(animeController)
                .build();
    }

    //private Anime



    @Test
    public void tryTest() throws Exception {
        Series s = this.getSeries();
        String jsonRequest = gson.toJson(s);
        System.out.println("yessss");
        MvcResult actualMvcResult = this.mockMvc.perform(MockMvcRequestBuilders
                .post("/anime/add")
                        .contentType("application/json")
                        .content(jsonRequest))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andReturn();
        assertEquals(Boolean.TRUE.toString(),actualMvcResult.getResponse().getContentAsString());
    }






}
