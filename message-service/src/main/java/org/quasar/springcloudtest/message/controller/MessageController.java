package org.quasar.springcloudtest.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Quasar
 * @version 1.0.0
 * @date 2021/6/13 14:58
 */
@RestController
public class MessageController {
    @RequestMapping(path = "/hello", method = RequestMethod.POST)
    public String helloWorld() {
        return "hello world.";
    }

    @RequestMapping(path = "hello2", method = RequestMethod.GET)
    public String hello2() {
        return "hello2";
    }
}
