/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod26.java.spring.banque.api.IDaoCompte;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

/**
 * @author Jerome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-data.xml")
public class DaoSQLCompteTest {

    @Autowired
    private IDaoCompte  daoCompte;

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
