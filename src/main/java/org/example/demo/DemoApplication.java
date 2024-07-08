package org.example.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.slf4j.LoggerFactory.getLogger;

@SpringBootApplication
public class DemoApplication {
    private static final Logger LOGGER = getLogger(DemoApplication.class);

    public static void main(String[] args) {
        LOGGER.info("demo starting ...");
        SpringApplication.run(DemoApplication.class, args);
        LOGGER.info("demo service started !");
    }
}
