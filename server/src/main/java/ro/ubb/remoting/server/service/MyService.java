package ro.ubb.remoting.server.service;

import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.Interfata;

import java.util.Arrays;
import java.util.List;

public class MyService implements Interfata {
    @Override
    public List<Student> getAll() {
        return Arrays.asList(new Student(1L,"name"), new Student(2L, "name2"));
    }
}
