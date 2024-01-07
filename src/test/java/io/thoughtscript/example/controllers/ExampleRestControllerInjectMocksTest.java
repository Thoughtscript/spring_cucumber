package io.thoughtscript.example.controllers;

import io.thoughtscript.example.services.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@Slf4j
@ExtendWith(MockitoExtension.class)
class ExampleRestControllerInjectMocksTest {

    private final String testString = "example";
    private final ResponseEntity<String> response = ResponseEntity.ok(testString);
    @InjectMocks
    ExampleRestController testController;
    @Mock
    ExampleService exampleService;

    @Test
    void testA() {
        when(exampleService.example()).thenReturn(testString);
        assertEquals(response, testController.example());
    }
}
