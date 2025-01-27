package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.StudentService;
import ro.ubb.remoting.server.repository.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StudentServiceImpl implements StudentService {
    private Repository<Long , Student> studentRepository;
    public StudentServiceImpl(Repository<Long, Student> studentRepository){
    this.studentRepository = studentRepository;
}


    @Override
    public Set<Student> findAll() {
        Iterable<Student> students = studentRepository.findAll();
        Set<Student> collect = StreamSupport.stream(students.spliterator(), false).collect(Collectors.toSet());
        return collect;
    }

    @Override
    public Integer add(Student student) {
        return this.studentRepository.save(student).isPresent()?1:0;
    }

    @Override
    public Optional<Student> delete(Long id) {
        return this.studentRepository.delete(id);
    }

    @Override
    public Integer update(Student student) {
        return this.studentRepository.update(student).isPresent()?1:0;
    }

    @Override
    public Object filterStudentByName(String s) {
        return null;
    }
}
