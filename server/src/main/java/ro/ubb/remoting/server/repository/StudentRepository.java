package ro.ubb.remoting.server.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import ro.ubb.remoting.common.domain.Student;

import java.util.List;
import java.util.Optional;

public class StudentRepository implements Repository<Long, Student> {
    private JdbcOperations jdbcOperations;

    @Override
    public Optional findOne(Long id) {
        Student student = null;
        String sql = "SELECT* FROM students WHERE id=?";
        List<Student> studentList = jdbcOperations.query(sql, new Object[]{id}, (rs, i) -> {
            String studentName = rs.getString("name");
            return new Student(id, studentName);
        });
        if (!studentList.isEmpty())
            student = studentList.get(0);

        return Optional.ofNullable(student);

    }

    @Override
    public Iterable<Student> findAll() {
       String sql = "SELECT * FROM students";
       return jdbcOperations.query(sql, (rs, i)->{
           Long id = rs.getLong("id");
           String studentName = rs.getString("name");
           return new Student(id, studentName);
       });
    }

    @Override
    public Optional<Student> save(Student entity) {
        return Optional.empty();
    }

    @Override
    public Optional<Student> delete(Long id) {
        return Optional.empty();
    }
}
