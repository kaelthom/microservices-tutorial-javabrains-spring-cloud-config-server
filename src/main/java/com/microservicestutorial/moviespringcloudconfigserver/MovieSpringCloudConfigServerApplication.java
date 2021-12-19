package com.microservicestutorial.moviespringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MovieSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieSpringCloudConfigServerApplication.class, args);
    }

}
