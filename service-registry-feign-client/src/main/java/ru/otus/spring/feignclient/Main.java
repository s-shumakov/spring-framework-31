package ru.otus.spring.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
        HelloService service = ctx.getBean(HelloService.class);

        String helloFromEurekaInstance = service.hello();

        System.out.println(helloFromEurekaInstance);
    }
}

