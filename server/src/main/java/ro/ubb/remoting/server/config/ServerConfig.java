package ro.ubb.remoting.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.common.domain.Grade;
import ro.ubb.remoting.common.domain.Student;
import ro.ubb.remoting.common.service.CatalogOnlineService;
import ro.ubb.remoting.server.repository.DisciplineRepository;
import ro.ubb.remoting.server.repository.GradeRepository;
import ro.ubb.remoting.server.repository.Repository;
import ro.ubb.remoting.server.repository.StudentRepository;
import ro.ubb.remoting.server.service.CatalogOnlineServiceImp;
import ro.ubb.remoting.server.service.DisciplineServiceImp;
import ro.ubb.remoting.server.service.GradeServiceImp;
import ro.ubb.remoting.server.service.StudentServiceImpl;

@Configuration
public class ServerConfig {
    @Bean
    RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceInterface(CatalogOnlineService.class);
        rmiServiceExporter.setService(onlineCatalogServiceImp());
        rmiServiceExporter.setServiceName("CatalogOnlineService");
        rmiServiceExporter.setRegistryPort(1099);

        return rmiServiceExporter;
    }

    @Bean
    CatalogOnlineService onlineCatalogServiceImp(){
        return new CatalogOnlineServiceImp(studentService(), disciplineService(), gradeService());
    }

    @Bean
    StudentServiceImpl studentService(){
        return new StudentServiceImpl(studentRepository());
    }

    @Bean
    Repository<Long, Student> studentRepository(){
        return new StudentRepository();
    }

    @Bean
    DisciplineServiceImp disciplineService(){
        return new DisciplineServiceImp(disciplineRepository());
    }

    @Bean
    Repository<Long, Discipline> disciplineRepository(){
        return new DisciplineRepository();
    }

    @Bean
    GradeServiceImp gradeService(){
        return new GradeServiceImp(studentRepository(),disciplineRepository(), gradeRepository());
    }

    @Bean
    Repository<Long, Grade> gradeRepository(){
        return new GradeRepository();
    }
}
