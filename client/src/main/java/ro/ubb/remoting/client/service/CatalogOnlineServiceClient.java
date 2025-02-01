package ro.ubb.remoting.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatalogOnlineService;

import java.util.List;
import java.util.Set;

public class CatalogOnlineServiceClient implements CatalogOnlineService {

    @Autowired
    private CatalogOnlineService service;

    @Override
    public void addStudent(Student student) {
        service.addStudent(student);

    }

    @Override
    public void updateStudent(Student student) {
        service.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long id) {
        service.deleteStudent(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @Override
    public Set<Student> filterStudentsByName(String s) {
        return service.filterStudentsByName(s);
    }

    @Override
    public void addDiscipline(Discipline discipline) {
        service.addDiscipline(discipline);
    }

    @Override
    public void updateDiscipline(Discipline discipline) {
        service.updateDiscipline(discipline);
    }

    @Override
    public void deleteDiscipline(Long id) {
        service.deleteDiscipline(id);
    }

    @Override
    public List<Discipline> getAllDiscipline() {
        return service.getAllDiscipline();
    }

    @Override
    public Set<Discipline> filterDisciplineByName(String s) {
        return service.filterDisciplineByName(s);
    }

    @Override
    public void addSGrade(Grade grade) {
        service.addSGrade(grade);
    }

    @Override
    public void updateGradeSubscription(Grade grade) {
        service.updateGradeSubscription(grade);
    }

    @Override
    public void deleteGrade(Long id) {
        service.deleteGrade(id);
    }

    @Override
    public List<Grade> getAllGrade() {
        return service.getAllGrade();
    }

    @Override
    public Set<Grade> findSubscriptionByHour(int min, int max) {
        return service.findSubscriptionByHour(min, max);
    }
}
