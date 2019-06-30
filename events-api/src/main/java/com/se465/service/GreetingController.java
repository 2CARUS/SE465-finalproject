package com.se465.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.se465.email.EmailHandler;
import com.se465.email.UNIT;
import com.se465.pojo.GreetingResponse;
import com.se465.pojo.HttpResponseObject;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public HttpResponseObject greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	
//    	EmailHandler.getInstance().sendEmail(UNIT.GREETING);
        return new GreetingResponse(counter.incrementAndGet(),
                            String.format(template, name));
    }
}