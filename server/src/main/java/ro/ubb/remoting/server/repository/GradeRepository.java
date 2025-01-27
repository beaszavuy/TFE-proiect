package ro.ubb.remoting.server.repository;

import org.springframework.jdbc.core.JdbcOperations;
import ro.ubb.remoting.common.domain.Grade;

import java.util.List;
import java.util.Optional;

public class GradeRepository implements Repository<Long, Grade>{

    private JdbcOperations jdbcOperations;

    @Override
    public Optional<Grade> findOne(Long id) {
        Grade grade = null;
        String sql = "SELECT * FROM grades where id=?";
        List<Grade> grades = jdbcOperations.query(sql, new Object[]{id}, (rs, i) -> {
            Long idStudent = rs.getLong("studentId");
            Long disciplineId = rs.getLong("disciplineId");
            Double gradeValue = rs.getDouble("gradeValue");
            return new Grade(id, idStudent, disciplineId, gradeValue);
        });
        if (!grades.isEmpty())
            grade = grades.get(0);
        return Optional.ofNullable(grade);
    }


    @Override
    public Iterable<Grade> findAll() {
        String sql = "SELECT * FROM grades";
        return jdbcOperations.query(sql, (rs, i) -> {
            Long id = rs.getLong("id");
            Long idStudent = rs.getLong("studentId");
            Long disciplineId = rs.getLong("disciplineId");
            Double gradeValue = rs.getDouble("gradeValue");
            return new Grade(id, idStudent, disciplineId, gradeValue);
        });
    }

    @Override
    public Optional<Grade> save(Grade entity) {
        String sql = "INSERT INTO grades (idStudent, disciplineId, gradeValue) VALUES (?,?,?)";
        jdbcOperations.update(sql, entity.getStudentId(), entity.getDisciplineId(), entity.getGradeValue());
        return Optional.of(entity);
    }

    @Override
    public Optional<Grade> delete(Long id) {
        Optional<Grade> grade = findOne(id);
        String sql = "DELETE FROM grades WHERE id=?";
        jdbcOperations.update(sql,id);
        return Optional.ofNullable(grade.get());

    }

    @Override
    public Optional<Grade> update(Grade entity) {
        String sql = "UPDATE grades set idStudent = ?, disciplineId = ?,gradeValue=?, where id=?";
        jdbcOperations.update(sql,entity.getStudentId(), entity.getDisciplineId(), entity.getGradeValue(),entity.getGradeValue());
        return Optional.ofNullable(entity);
    }
}
