package ro.ubb.remoting.common.domain;

import java.io.Serializable;

public class Student extends BaseEntity <Long> implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
//    private int grade;


    public Student(Long id, String name) {
        super.setId(id);
        this.name = name;
//        this.grade = grade;
    }
    public Student(){
            this.name="";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "name='" + name + '\'' +
//                ", grade=" + grade +
                '}';
    }
}
