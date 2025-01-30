package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface StudentService extends Service<Student>{
    Set<Student> findAll();
    Integer add(Student student);
    Optional<Student> delete(Long id);

    Integer update (Student student);

    Object filterStudentByName(String s);
}
