package io.thoughtscript.example.controllers;

import io.thoughtscript.example.services.ExampleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest()
class ExampleRestControllerIntegrationTest {

    private final String testString = "OK";

    @Autowired
    ExampleService exampleService;

    @Test
    void testA() {
        assertEquals(testString, exampleService.example());
    }
}
