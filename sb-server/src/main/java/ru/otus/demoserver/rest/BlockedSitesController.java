package ru.otus.demoserver.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.demoserver.domain.BlockedSite;
import ru.otus.demoserver.repository.BlockedSitesRepository;

import java.util.List;

@RestController
public class BlockedSitesController {

    private final Logger logger = LoggerFactory.getLogger(BlockedSitesController.class);

    private final BlockedSitesRepository repository;

    public BlockedSitesController(BlockedSitesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/blocked-sites")
    public List<BlockedSite> blockedSites() {
        logger.info("Request has been performed");
        return repository.findAll();
    }
}
