package com.example.WebApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/"))
            .andDo(print())
            .andExpect(status().isOk())  
            .andExpect(content().string(containsString("Hello, World!")));  
    }

    @Test
    public void shouldReturnEmillyMessage() throws Exception {
        this.mockMvc.perform(get("/Emilly"))
            .andDo(print())
            .andExpect(status().isOk())  
            .andExpect(content().string(containsString("Hello, Emilly!")));  
    }

  
    @Test
    public void shouldReturnRamideMessage() throws Exception {
        this.mockMvc.perform(get("/Ramide"))
            .andDo(print())
            .andExpect(status().isOk()) 
            .andExpect(content().string(containsString("Hello, Ramide!")));  
    }
    
    @Test
    public void shouldReturnLauraMessage() throws Exception {
        this.mockMvc.perform(get("/Laura"))
            .andDo(print())
            .andExpect(status().isOk())  
            .andExpect(content().string(containsString("Hello, Laura!"))); 
    }
    @Test
    public void shouldReturnThaisMessage() throws Exception {
        this.mockMvc.perform(get("/Thais"))
            .andDo(print())
            .andExpect(status().isOk())  
            .andExpect(content().string(containsString("Hello, Thais!"))); 
    }
}
