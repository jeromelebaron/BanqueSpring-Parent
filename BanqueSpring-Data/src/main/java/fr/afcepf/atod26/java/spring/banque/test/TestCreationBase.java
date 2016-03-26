package fr.afcepf.atod26.java.spring.banque.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Client;

public class TestCreationBase {

    private static final Logger LOG = Logger.getLogger(TestCreationBase.class);

    private TestCreationBase() {
    }

    public static void main(String[] args) {

        BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring-data.xml");
        IDaoUtilisateur daoUser = bf.getBean(IDaoUtilisateur.class);
        List<Client> lesClient = daoUser.getAllClient();
        for (Client localClient : lesClient) {
            LOG.info(localClient.getIdUtilisateur());
        }
    }

}
