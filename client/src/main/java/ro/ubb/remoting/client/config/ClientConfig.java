package ro.ubb.remoting.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import ro.ubb.remoting.client.service.CatalogOnlineServiceClient;
import ro.ubb.remoting.client.ui.ClientConsole;
import ro.ubb.remoting.common.service.CatelogOnlineService;
import ro.ubb.remoting.common.service.StudentService;

@Configuration
public class ClientConfig {
    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/CatelogOnlineService");
        rmiProxyFactoryBean.setServiceInterface(CatelogOnlineService.class);

        return rmiProxyFactoryBean;
    }

    @Bean
    ClientConsole clientConsole() {
        ClientConsole clientConsole = new ClientConsole(catelogOnlineServiceClient());
        return clientConsole;
    }

    @Bean
    CatelogOnlineService catelogOnlineServiceClient(){
        CatalogOnlineServiceClient catalogOnlineServiceClient =  new CatalogOnlineServiceClient();
        return  catalogOnlineServiceClient;
    }
}
