/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.api.IDaoCompte;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

/**
 * @author Jerome
 */
public class DaoSQLCompteTest {

    private IDaoCompte  daoCompte;
    private BeanFactory bf;

    @Before
    public void init() {
        bf = new ClassPathXmlApplicationContext("classpath:spring-data.xml");
        daoCompte = bf.getBean(IDaoCompte.class);
    }

    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLCompte#getCompteByClient(fr.afcepf.atod26.java.spring.banque.entity.Client)}.
     */
    @Test
    public void testGetCompteByClient() {
        Client client = new Client(1, "Le Baron", "Jérome", "lebaronjerome@free.fr", "dopler");
        List<Compte> listeCompteTrouves = daoCompte.getCompteByClient(client);
        int tailleListeComptesTrouves = listeCompteTrouves.size();

        int tailleListeCompteAttendu = 2;

        Assert.assertEquals("Vérification du nombre de compte pour ce client", tailleListeCompteAttendu, tailleListeComptesTrouves);
    }

    /**
     * Test method for {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLCompte#getCompteByIdClient(int)}.
     */
    @Test
    public void testGetCompteByIdClient() {
        List<Compte> listeCompteTrouves = daoCompte.getCompteByIdClient(1);
        int tailleListeComptesTrouves = listeCompteTrouves.size();

        int tailleListeCompteAttendu = 2;

        Assert.assertEquals("Vérification du nombre de compte pour ce client", tailleListeCompteAttendu, tailleListeComptesTrouves);
    }

}
