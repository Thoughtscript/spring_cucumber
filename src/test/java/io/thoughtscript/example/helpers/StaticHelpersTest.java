package io.thoughtscript.example.helpers;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class StaticHelpersTest {

    private final String EXPECTED = "invoked";

    @BeforeAll
    // This has to be a static method
    static void init() {
        log.info("JUnit 5 Jupiter tests initializing...");
    }

    @BeforeEach
    void eachInit() {
        log.info("Running before each time...");
    }

    @Test
    // These cannot be private visibility apparently
    void testA() {
            assertEquals(EXPECTED, StaticHelpers.invoke());
    }

    @Test
    void testB() {
        assertNotNull(StaticHelpers.invoke());
    }

    @Test
    void testC() {
        assertEquals(EXPECTED.length(), StaticHelpers.invoke().length());
        assertNotEquals("incorrectString", StaticHelpers.invoke());
    }

    @AfterEach
    void eachAfter() {
        log.info("Running after each time...");
    }


    @AfterAll
    // This has to be a static method
    static void shutdown() {
        log.info("JUnit 5 Jupiter tests completed...");
    }
}
