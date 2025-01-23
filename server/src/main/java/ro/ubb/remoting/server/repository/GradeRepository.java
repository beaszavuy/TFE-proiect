package ro.ubb.remoting.server.repository;

import org.springframework.jdbc.core.JdbcOperations;
import ro.ubb.remoting.common.domain.Grade;

import java.util.Optional;

public class GradeRepository implements Repository<Long, Grade>{

    private JdbcOperations jdbcOperations;
    @Override
    public Optional<Grade> findOne(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<Grade> findAll() {
        return null;
    }

    @Override
    public Optional<Grade> save(Grade entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Grade> delete(Long aLong) {
        return Optional.empty();
    }
}
