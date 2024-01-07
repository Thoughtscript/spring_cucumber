package io.thoughtscript.example.controllers;

import io.thoughtscript.example.services.ExampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExampleRestController.class)
class ExampleRestControllerWebMvcTest {

    //This has to be present and will be injected automatically into the ExampleRestController.
    @MockBean
    ExampleService exampleService;

    @Autowired
    private MockMvc mvc;

    @Test
    void testA() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                        .get("/api/example")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
