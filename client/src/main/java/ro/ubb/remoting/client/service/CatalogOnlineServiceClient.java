package ro.ubb.remoting.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatelogOnlineService;
import ro.ubb.remoting.common.service.StudentService;

import java.util.List;
import java.util.Set;

public class CatalogOnlineServiceClient implements CatelogOnlineService {

    @Autowired
    private CatelogOnlineService service;
//    public CatalogOnlineServiceClient(CatelogOnlineService service) {
//        this.service = service;
//    }

    @Override
    public void addStudent(Student student) {
        service.addStudent(student);

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public Set<Student> getAllStudents() {
        return null;
    }

    @Override
    public Set<Student> filterStudentsByName(String s) {
        return null;
    }

    @Override
    public void addDiscipline(Discipline discipline) {

    }

    @Override
    public void updateDiscipline(Discipline discipline) {

    }

    @Override
    public void deleteDiscipline(Long id) {

    }

    @Override
    public Set<Discipline> getAllDiscipline() {
        return null;
    }

    @Override
    public Set<Discipline> filterDisciplineByName(String s) {
        return null;
    }

    @Override
    public void addSGrade(Grade grade) {

    }

    @Override
    public void updateGradeSubscription(Grade grade) {

    }

    @Override
    public void deleteGrade(Long id) {

    }

    @Override
    public Set<Grade> getAllGrade() {
        return null;
    }

    @Override
    public List<Grade> findSubscriptionByHour(int min, int max) {
        return null;
    }
}
