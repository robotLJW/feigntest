package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    FeignClientProvider client;

    @RequestMapping("provider")
    public String feignConsumer() {
        return client.hello() + " feign consumer call finished!!!";
    }
}
