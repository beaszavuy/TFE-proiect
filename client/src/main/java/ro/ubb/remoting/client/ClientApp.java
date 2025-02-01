package ro.ubb.remoting.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.ubb.remoting.client.ui.ClientConsole;
import ro.ubb.remoting.common.service.CatalogOnlineService;
import java.rmi.Naming;
public class ClientApp {
    public static void main(String[] args) {
//        try {
//            CatalogOnlineService service = (CatalogOnlineService) Naming.lookup("rmi://localhost:1099/CatalogOnlineService");
//            System.out.println("conexiune : " + service.getAllStudents());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext("ro.ubb.remoting.client.config");

        System.out.println(context.getBeanDefinitionNames());

        ClientConsole clientConsole=context.getBean(ClientConsole.class);
        clientConsole.runConsole();

        System.out.println("bye client");
    }
}