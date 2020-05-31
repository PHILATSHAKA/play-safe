package com.playsafe.phila;

import com.playsafe.phila.controller.PlaySafeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@PowerMockIgnore("jdk.internal.reflect.*")
@RunWith(PowerMockRunner.class)
public class PlaySafeMock {
    private MockMvc mockMvc;

    @InjectMocks
    private PlaySafeController playSafeController;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(playSafeController).build();
    }

    @Test
    public void kelvinToCelsiusTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/conversions/ktoc").accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.parseMediaType("application/json"))
                .param("kelvin", "30.0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void celsiusToKelvinTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/conversions/ctok").accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.parseMediaType("application/json"))
                .param("celsius", "25.0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void milesToKilometersTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/conversions/mtok").accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.parseMediaType("application/json"))
                .param("miles", "15.0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void kilometersToMilesTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/conversions/ktom").accept(MediaType.APPLICATION_JSON_VALUE)
                .contentType(MediaType.parseMediaType("application/json"))
                .param("kilometers", "20.0"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
