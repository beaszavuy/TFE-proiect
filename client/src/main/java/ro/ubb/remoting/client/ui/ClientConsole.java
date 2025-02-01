package ro.ubb.remoting.client.ui;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatalogOnlineService;
import ro.ubb.remoting.common.service.Interfata;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ClientConsole {
    private CatalogOnlineService service;
    @Autowired private Interfata interfata;

    public ClientConsole(CatalogOnlineService service) {
        this.service = service;
    }

    public void runConsole() {
        System.out.println("vdjn");
        interfata.getAll().forEach(student -> System.out.println(student));
        System.out.printf("vdhfsjaaa");
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

    private void printAllStudents() {
        List<Student> students = service.getAllStudents();
        if (students==null){
            System.out.println("nu sunt studenti");// Feltételezve, hogy már List-et ad vissza
        }else{
            System.out.println(students);
        }

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
