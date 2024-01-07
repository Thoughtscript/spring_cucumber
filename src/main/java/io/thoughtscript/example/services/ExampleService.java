package io.thoughtscript.example.services;

import io.thoughtscript.example.helpers.StaticHelpers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExampleService {

    public String example() {
        StaticHelpers.invoke();
        log.info("example");
        return "OK";
    }
}
