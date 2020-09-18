package ru.vlapin.experiments.experimentspringbootdemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.experimentspringbootdemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
