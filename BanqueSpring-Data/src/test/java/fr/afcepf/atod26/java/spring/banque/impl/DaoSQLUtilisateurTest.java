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

import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

/**
 * @author Jerome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-data.xml")
public class DaoSQLUtilisateurTest {

    @Autowired
    private IDaoUtilisateur daoUtilisateur;
    
    @Test
    public void notNull(){
        Assert.assertNotNull(daoUtilisateur);
    }
    
    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLUtilisateur#connexionUtilisateur(java.lang.String, java.lang.String)} .
     */
    @Test
    public void testConnexionUtilisateur() {
        List<Utilisateur> listeUtilisateurAttendu = daoUtilisateur.connexionUtilisateur("clien1@mabanque.spring", "12345");

        int idUtilisateurAttendu = 1;
        int idUtilisateurTrouve = listeUtilisateurAttendu.get(0).getIdUtilisateur();

        Assert.assertEquals("Vérification de l'id récupéré de l'utilisateur", idUtilisateurAttendu, idUtilisateurTrouve);
    }

    @Test
    public void testGetAllClient() {
        List<Client> lesClientsTrouves = daoUtilisateur.getAllClient();

        int tailleAttendueDeLaListe = 4;
        Assert.assertEquals("Vérification du nombre de clients récupérés", tailleAttendueDeLaListe, lesClientsTrouves.size());
    }
}
