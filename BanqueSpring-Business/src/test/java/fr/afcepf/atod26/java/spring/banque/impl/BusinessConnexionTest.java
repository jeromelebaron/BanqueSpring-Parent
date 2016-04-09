/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConnexion;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

/**
 * @author Jerome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-business.xml")
public class BusinessConnexionTest {

    @Autowired
    private IBusinessConnexion businessConnexion;

    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.BusinessConnexion#connexionUtilisateur(java.lang.String, java.lang.String)}
     * @throws Exception
     */
    @Test
    public void testConnexionUtilisateur() throws Exception {

        Utilisateur utilisateurAttendu = businessConnexion.connexionUtilisateur("clien1@mabanque.spring", "12345");

        int idUtilisateurAttendu = 1;
        int idUtilisateurTrouve = utilisateurAttendu.getIdUtilisateur();

        Assert.assertEquals("Vérification de l'id récupéré de l'utilisateur", idUtilisateurAttendu, idUtilisateurTrouve);
    }

}
