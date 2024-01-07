package io.thoughtscript.example.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
/*
 Apparently auto-wiring into a "basic" Jupiter test
 also requires this annotation now.
*/
public class ExampleServiceWithAutoWiringTest {
    private final String EXPECTED = "OK";

    @Autowired
    ExampleService testService;

    @Test
    void testA() {
        assertEquals(EXPECTED, testService.example());
    }
}
