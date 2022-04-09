package com.example.consumer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="${client.server.name}",url = "${client.server.url}")
public interface FeignClientProvider{
    @RequestMapping("/hello")
    public String hello();
}
