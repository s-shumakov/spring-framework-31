package ru.otus.spring.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
