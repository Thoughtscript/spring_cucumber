package io.thoughtscript.example.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ExampleServiceWithoutAutoWiringTest {

    private final String EXPECTED = "OK";

    private ExampleService testService = new ExampleService();

    @Test
    void testA() {
        assertEquals(EXPECTED, testService.example());
    }
}
