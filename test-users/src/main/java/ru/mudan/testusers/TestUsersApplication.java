package ru.mudan.testusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"ru.mudan"})
@EnableJpaRepositories(basePackages = {"ru.mudan"})
public class TestUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUsersApplication.class, args);
    }

}
