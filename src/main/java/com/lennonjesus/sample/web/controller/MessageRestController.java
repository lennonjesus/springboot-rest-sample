package com.lennonjesus.sample.web.controller;

import com.lennonjesus.sample.domain.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lennon Jesus
 */
@RestController
public class MessageRestController {

    @RequestMapping(value = "/message")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    Message sayHello() {
        return new Message(1L, "Hello, world, from another server!");
    }

}
