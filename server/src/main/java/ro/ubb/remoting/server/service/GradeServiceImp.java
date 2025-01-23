package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.GradeService;
import ro.ubb.remoting.server.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class GradeServiceImp implements GradeService {

    private Repository<Long, Student> studentRepository;
    private Repository<Long, Discipline> disciplineRepository;

    private Repository<Long, Grade> gradeRepository;

    public GradeServiceImp(Repository<Long, Student> studentRepository, Repository<Long, Discipline> disciplineRepository, Repository<Long, Grade> gradeRepository) {
        this.studentRepository = studentRepository;
        this.disciplineRepository = disciplineRepository;
        this.gradeRepository = gradeRepository;
    }

    @Override
    public Set<Grade> findAll() {
        Iterable<Grade> grade = gradeRepository.findAll();
        Set<Grade> collect = StreamSupport.stream(grade.spliterator(),false).collect(Collectors.toSet());
        return  collect;
    }

    @Override
    public Integer add(Grade entity) {
        if (disciplineRepository.findOne(entity.getDisciplineId()).get()==null){
            throw new RuntimeException("cursul nu exti");
            
        }
        if(studentRepository.findOne(entity.getStudentId()).get()==null){
            throw new RuntimeException("studentul nu exzista");
        }
        return gradeRepository.save(entity).isPresent()?1:0;
    }

    @Override
    public Optional<Grade> delete(Long id) {
        return Optional.empty();
    }

    @Override
    public Integer update(Grade entity) {
        return null;
    }

    @Override
    public List<Grade> findGrade(int min, int max) {
        return null;
    }
}
