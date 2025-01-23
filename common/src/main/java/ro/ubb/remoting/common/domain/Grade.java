package ro.ubb.remoting.common.domain;

import java.io.Serializable;

public class Grade extends BaseEntity <Long> implements Serializable {

    private Long studentId;
    private Long disciplineId;
    private Double gradeValue;


    public Grade(Long id, Long studentId, Long disciplineId, Double gradeValue) {
        super.setId(id);
        this.studentId = studentId;
        this.disciplineId = disciplineId;
        this.gradeValue = gradeValue;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Long disciplineId) {
        this.disciplineId = disciplineId;
    }

    public Double getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(Double gradeValue) {
        this.gradeValue = gradeValue;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentId=" + studentId +
                ", disciplineId=" + disciplineId +
                ", gradeValue=" + gradeValue +
                '}';
    }
}
