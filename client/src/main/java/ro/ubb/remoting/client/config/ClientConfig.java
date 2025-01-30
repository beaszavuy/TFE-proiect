package ro.ubb.remoting.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import ro.ubb.remoting.client.service.CatalogOnlineServiceClient;
import ro.ubb.remoting.client.ui.ClientConsole;
import ro.ubb.remoting.common.service.CatalogOnlineService;

@Configuration
public class ClientConfig {
    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/CatalogOnlineService");
        rmiProxyFactoryBean.setServiceInterface(CatalogOnlineService.class);
        System.out.println("RMI Service registered successfully client!");

        return rmiProxyFactoryBean;
    }

    @Bean
    ClientConsole clientConsole() {
        return new ClientConsole(catalogOnlineServiceClient());
    }

    @Bean
    CatalogOnlineService catalogOnlineServiceClient(){
    return new CatalogOnlineServiceClient();
    }
}
