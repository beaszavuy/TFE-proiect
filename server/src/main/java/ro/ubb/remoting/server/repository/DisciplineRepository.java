package ro.ubb.remoting.server.repository;

import ro.ubb.remoting.common.domain.BaseEntity;
import ro.ubb.remoting.common.domain.Discipline;

import java.util.Optional;

public class DisciplineRepository implements Repository<Long, Discipline>{


    @Override
    public Optional<Discipline> findOne(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<Discipline> findAll() {
        return null;
    }

    @Override
    public Optional<Discipline> save(Discipline entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Discipline> delete(Long aLong) {
        return Optional.empty();
    }
}
