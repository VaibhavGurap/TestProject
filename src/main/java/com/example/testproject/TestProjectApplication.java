package com.example.testproject;

import com.example.testproject.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@Slf4j
public class TestProjectApplication {

    @Autowired
    AppConfig appConfig;

    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    void test() {
        log.info("test");
        log.info(appConfig.getValue());
        log.info("Application Started Manually");
    }
}
