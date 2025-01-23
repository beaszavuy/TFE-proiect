package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.service.DisciplineService;
import ro.ubb.remoting.server.repository.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    public Object filterDisciplineByName(String filterName) {
        return null;
    }

    @Override
    public Set<Discipline> findAll() {
        Iterable<Discipline> disciplines = disciplineRepository.findAll();
        Set<Discipline> collect = StreamSupport.stream(disciplines.spliterator(),false).collect(Collectors.toSet());
        return collect;
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
