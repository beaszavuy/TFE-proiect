package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.service.DisciplineService;
import ro.ubb.remoting.server.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class DisciplineServiceImp implements DisciplineService {
    private Repository<Long, Discipline> disciplineRepository;
    public DisciplineServiceImp(Repository<Long, Discipline> disciplineRepository){
        this.disciplineRepository = disciplineRepository;
    }
    @Override
    public Integer addDiscipline(Discipline discipline) {
        return this.disciplineRepository.save(discipline).isPresent()?1:0;
    }

    @Override
    public Set<Discipline> filterDisciplineByName(String filterName) {
        return null;
    }

    @Override
    public Set<Discipline> findAll() {
        return null;
    }


    @Override
    public Integer add(Discipline entity) {
        return null;
    }

    @Override
    public Optional<Discipline> delete(Long id) {
        return Optional.empty();
    }

    @Override
    public Integer update(Discipline discipline) {
        return null;
    }

    @Override
    public Optional<Discipline> deleteDiscipline(Long id) {
        return Optional.empty();
    }
}
