package ro.ubb.remoting.common.domain;

import java.io.Serializable;

public class Discipline extends BaseEntity<Long> implements Serializable {
    private String name;
    private Integer credits;
    private static final long serialVersionUID = 1L;
    public Discipline(Long id, String name, Integer credits) {
        super.setId(id);
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}
