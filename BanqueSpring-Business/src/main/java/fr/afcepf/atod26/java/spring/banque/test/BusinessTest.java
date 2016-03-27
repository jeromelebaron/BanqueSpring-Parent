package fr.afcepf.atod26.java.spring.banque.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConseiller;
import fr.afcepf.atod26.java.spring.banque.entity.Client;

public class BusinessTest {

    private static final Logger LOG = Logger.getLogger(BusinessTest.class);

    /**
     * 
     */
    private BusinessTest() {
    }

    public static void main(final String[] args) {

        final BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring-business.xml");
        final IBusinessConseiller businessConseiller = bf.getBean(IBusinessConseiller.class);

        final List<Client> lesClient = businessConseiller.getAllClient();
        for (final Client localClient : lesClient) {
            LOG.info(localClient);
        }

    }

}
