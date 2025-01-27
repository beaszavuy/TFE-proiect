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
                    case "1":
                        printAllStudents();
                        break;
                    case "2":
                        addStudent();
                        break;
                    case "3":
                        updateStudent();
                        break;
                    case "4":
                        deleteStudent();

                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void printMenu(){
        System.out.println(""+
                "1 - All students\n"+
                "2 - Add new student\n"+
                "3 - Update student\n"+
                "4 - Delete student\n"+
                "x - EXIT" );


    }

    private void printAllStudents(){
        Set<Student> student = service.getAllStudents();
        System.out.println(student);
    }

    private void addStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID: ");
        Long id = scanner.nextLong();

        System.out.println("Name: ");
        String name = scanner.next();

        Student student = new Student(id, name);
        service.addStudent(student);
    }

    private void updateStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID");
        Long id = scanner.nextLong();

        System.out.println("Name: ");
        String name = scanner.next();

        Student student = new Student(id, name);
        service.updateStudent(student);
    }

    private void deleteStudent(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID");
        Long idToDelete = scanner.nextLong();
        service.deleteStudent(idToDelete);

    }
}
