package ro.ubb.remoting.common.domain;

import java.io.Serializable;

public class Student extends BaseEntity <Long> implements Serializable {

    private String name;
//    private int grade;

    public Student() {
    }

    public Student(Long id, String name) {
        super.setId(id);
        this.name = name;
//        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setGrade(int grade) {
//        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
//                ", grade=" + grade +
                '}';
    }
}
