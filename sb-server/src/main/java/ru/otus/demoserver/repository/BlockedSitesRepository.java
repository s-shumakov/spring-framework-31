package ru.otus.demoserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.otus.demoserver.domain.BlockedSite;

@Repository
public interface BlockedSitesRepository extends JpaRepository<BlockedSite, Integer> {
}
