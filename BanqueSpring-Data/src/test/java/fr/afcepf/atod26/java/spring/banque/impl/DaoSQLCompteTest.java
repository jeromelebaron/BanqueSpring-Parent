/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
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
@ContextConfiguration("classpath:spring-data-test.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DaoSQLCompteTest {

    @Autowired
    private IDaoCompte  daoCompte;

    @Test
    public void testANotNull(){
        Assert.assertNotNull(daoCompte);
    }
    
    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLCompte#getCompteByClient(fr.afcepf.atod26.java.spring.banque.entity.Client)}.
     */
    @Test
    public void testBGetCompteByClient() {
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
    public void testCGetCompteByIdClient() {
        List<Compte> listeCompteTrouves = daoCompte.getCompteByIdClient(1);
        int tailleListeComptesTrouves = listeCompteTrouves.size();

        int tailleListeCompteAttendu = 2;

        Assert.assertEquals("Vérification du nombre de compte pour ce client", tailleListeCompteAttendu, tailleListeComptesTrouves);
    }
    
    @Test
    public void testDInsertCompte(){
        Compte nouveauCompte = new Compte("LDD", new Date(), new Client(1, null, null, null, null));
        daoCompte.insertCompte(nouveauCompte);
        int idNouveauCompteGenere = nouveauCompte.getNumeroCompte();
        
        int idNouveauCompteAttendu = 11;
        
        Assert.assertEquals("Vérification de l'insertion du nouveau compte", idNouveauCompteAttendu, idNouveauCompteGenere);
    }

}
