package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.Grade;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface GradeService extends Service<Grade>{


    Set<Grade> findAll();


    Integer add(Grade entity);


    Optional<Grade> delete(Long id);


    Integer update(Grade entity);

    List<Grade> findGrade(int min, int max);
}
