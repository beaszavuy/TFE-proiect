package ro.ubb.remoting.client.ui;

import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatelogOnlineService;
import ro.ubb.remoting.common.service.StudentService;

import java.util.Scanner;
import java.util.Set;

public class ClientConsole {
    private CatelogOnlineService service;

    public ClientConsole(CatelogOnlineService service) {
        this.service = service;
    }

    public void runConsole() {
        printMenu();
//        studentService.getAllStudents()
//                .forEach(student -> System.out.println(student));

        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                String option = scanner.next();
                if (option.equals("x")){
                    break;
                }
                switch (option){
                    case "1": printAllStudents();
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void printMenu(){
        System.out.println(""+
                "1 - All students\n");
    }

    private void printAllStudents(){
        Set<Student> student = service.getAllStudents();
        System.out.println(student);
    }
}
