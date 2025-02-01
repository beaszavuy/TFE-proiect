package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatalogOnlineService;

import java.util.List;
import java.util.Set;

public class CatalogOnlineServiceImp implements CatalogOnlineService {

    private StudentServiceImpl studentService;
    private DisciplineServiceImp disciplineService;

    private GradeServiceImp gradeService;

    public CatalogOnlineServiceImp(StudentServiceImpl studentService, DisciplineServiceImp disciplineService, GradeServiceImp gradeService) {

        this.studentService = studentService;
        this.disciplineService = disciplineService;
        this.gradeService = gradeService;
    }

    @Override
    public void addStudent(Student student) {
        studentService.add(student);

    }
    @Override
    public void updateStudent(Student student) {
        studentService.update(student);

    }
    @Override
    public void deleteStudent(Long id) {
        studentService.delete(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @Override
    public Set<Student> filterStudentsByName(String s) {
        return studentService.filterStudentByName(s);
    }




    @Override
    public void addDiscipline(Discipline discipline) {
        disciplineService.addDiscipline(discipline);

    }

    @Override
    public void updateDiscipline(Discipline discipline) {
        disciplineService.update(discipline);
    }

    @Override
    public void deleteDiscipline(Long id) {
        disciplineService.deleteDiscipline(id);
    }

    @Override
    public List<Discipline> getAllDiscipline() {
       return disciplineService.findAll();
    }

    @Override
    public Set<Discipline> filterDisciplineByName(String s) {
         return disciplineService.filterDisciplineByName(s);
    }

    @Override
    public void addSGrade(Grade grade) {
        gradeService.add(grade);
    }

    @Override
    public void updateGradeSubscription(Grade grade) {
        gradeService.update(grade);
    }

    @Override
    public void deleteGrade(Long id) {
        gradeService.delete(id);
    }

    @Override
    public List<Grade> getAllGrade() {
        return gradeService.findAll();
    }

    @Override
    public Set<Grade> findSubscriptionByHour(int min, int max) {
        return null;
    }
}
