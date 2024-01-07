package io.thoughtscript.example.controllers;

import io.thoughtscript.example.services.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/")
public class ExampleRestController {

    @Autowired
    ExampleService exampleService;

    @GetMapping("/example")
    public ResponseEntity example() {
        return ResponseEntity.ok(exampleService.example());
    }
}