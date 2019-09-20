package io.l0llygag.roadxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "io.l0llygag.roadxserver.database")
public class RoadxServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoadxServerApplication.class, args);
    }

}
