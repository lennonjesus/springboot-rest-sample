package com.lennonjesus.sample;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootRestSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestSampleApplication.class, args);
    }


    @RequestMapping(value = "/message")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Message sayHello() {
        return new Message(1L, "Hello, world!");
    }

    class Message {

        private Long id;

        private String message;

        public Message(Long id, String message) {
            this.id = id;
            this.message = message;
        }

        public Long getId() {
            return id;
        }

        public String getMessage() {
            return message;
        }
    }
}
