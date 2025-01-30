package ro.ubb.remoting.server.repository;

import org.springframework.jdbc.core.JdbcOperations;
import ro.ubb.remoting.common.domain.BaseEntity;
import ro.ubb.remoting.common.domain.Discipline;

import java.util.List;
import java.util.Optional;

public class DisciplineRepository implements Repository<Long, Discipline>{

    private JdbcOperations jdbcOperations;
    @Override
    public Optional<Discipline> findOne(Long id) {
        Discipline discipline = null;
        String sql = "SELECT * FROM disciplines where id=?";
        List<Discipline> disciplines = jdbcOperations.query(sql, new Object[]{id}, (rs, i) -> {
            String disciplineTitle = rs.getString("name");
         int credit = rs.getInt("credit");
            return new Discipline(id, disciplineTitle, credit);
        });
        if (!disciplines.isEmpty())
            discipline = disciplines.get(0);
        return Optional.ofNullable(discipline);
    }

    @Override
    public Iterable<Discipline> findAll() {
        String sql = "SELECT * FROM discipline";
        return jdbcOperations.query(sql, (rs, i) -> {
            Long id = rs.getLong("id");
            String discipineTitle = rs.getString("name");
            int credit = rs.getInt("credit");
            return new Discipline(id, discipineTitle, credit);
        });
    }

    @Override
    public Optional<Discipline> save(Discipline entity) {
        String sql = "INSERT INTO disciplines (id,name,credit) VALUES (?,?,?)";
        jdbcOperations.update(sql,entity.getId(), entity.getName(), entity.getCredits());
        return Optional.of(entity);
    }

    @Override
    public Optional<Discipline> delete(Long id) {
        Optional<Discipline> discipline = findOne(id);
        String sql = "DELETE FROM disciplines WHERE id=?";
        jdbcOperations.update(sql,id);
        return Optional.ofNullable(discipline.get());
    }

    @Override
    public Optional<Discipline> update(Discipline entity) {
        String sql = "update disciplines set name = ?, credit = ? where id=?";
        jdbcOperations.update(sql,entity.getName(), entity.getCredits(), entity.getId());
        return Optional.ofNullable(entity);
    }
}
