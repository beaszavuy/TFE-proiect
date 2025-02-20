package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface DisciplineService extends  Service<Discipline>{

    Integer addDiscipline(Discipline discipline);

    Object filterDisciplineByName(String filterName);

    List<Discipline> findAll();

    Integer update (Discipline discipline);
    Optional<Discipline>deleteDiscipline(Long id);
}
