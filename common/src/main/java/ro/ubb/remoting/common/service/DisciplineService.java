package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.Discipline;

import java.util.Optional;
import java.util.Set;

public interface DisciplineService extends  Service<Discipline>{

    Integer addDiscipline(Discipline discipline);

    Object filterDisciplineByName(String filterName);

    Set<Discipline> findAll();

    Integer update (Discipline discipline);
    Optional<Discipline>deleteDiscipline(Long id);
}
