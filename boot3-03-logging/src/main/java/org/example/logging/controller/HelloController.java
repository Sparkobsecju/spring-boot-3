package org.example.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/h")
    public String hello() {

        log.info("XDDD，方法進來了");
//        logger.info("XDDD，方法進來了");
        return "hello";
    }
}
