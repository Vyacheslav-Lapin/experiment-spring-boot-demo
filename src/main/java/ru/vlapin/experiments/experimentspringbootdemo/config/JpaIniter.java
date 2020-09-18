package ru.vlapin.experiments.experimentspringbootdemo.config;

import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.experimentspringbootdemo.dao.CatRepository;
import ru.vlapin.experiments.experimentspringbootdemo.model.Cat;

@Component
@RequiredArgsConstructor
public class JpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Arrays.stream("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
