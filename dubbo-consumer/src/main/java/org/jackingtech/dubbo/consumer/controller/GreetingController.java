package org.jackingtech.dubbo.consumer.controller;

import org.jackingtech.dubbo.provider.service.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Reference
    private GreetingService greetingService;

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.sayHello(name);
    }
}