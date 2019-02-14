package com.objcoding.dockerjenkinssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerJenkinsSample1Application {

    @RequestMapping("/")
    public String sayHello() {
        return "hello docker 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsSample1Application.class, args);
    }

}

