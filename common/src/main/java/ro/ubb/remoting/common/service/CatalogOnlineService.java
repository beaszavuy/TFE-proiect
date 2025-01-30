package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;

import java.util.Set;

public interface CatalogOnlineService {


    public void addStudent(Student student);
    public void updateStudent (Student student);

    public void deleteStudent(Long id);
    public Set<Student> getAllStudents();
    public Set<Student> filterStudentsByName(String s);


    public void addDiscipline(Discipline discipline);
    public void updateDiscipline (Discipline discipline);

    public void deleteDiscipline(Long id);
    public Set<Discipline> getAllDiscipline();
    public Set<Discipline> filterDisciplineByName(String s);



    public void addSGrade(Grade grade);
    public void updateGradeSubscription (Grade grade);
    public void deleteGrade(Long id);
    public Set<Grade> getAllGrade();
    public Set<Grade> findSubscriptionByHour(int min, int max);
}
