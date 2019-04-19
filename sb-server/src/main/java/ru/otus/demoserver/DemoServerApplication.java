package ru.otus.demoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.otus.demoserver.domain.BlockedSite;
import ru.otus.demoserver.repository.BlockedSitesRepository;

@SpringBootApplication
public class DemoServerApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoServerApplication.class, args);
        BlockedSitesRepository repository = ctx.getBean(BlockedSitesRepository.class);
        repository.save(new BlockedSite("https://telegram.org/"));
        repository.save(new BlockedSite("https://azure.microsoft.com/"));
    }
}

