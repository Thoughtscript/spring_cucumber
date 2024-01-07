package io.thoughtscript.example.helpers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticHelpers {

    public static String invoke() {
        log.info("invoked");
        return "invoked";
    }
}
