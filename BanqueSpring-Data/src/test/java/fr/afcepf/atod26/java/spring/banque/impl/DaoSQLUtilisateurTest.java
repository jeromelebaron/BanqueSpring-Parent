/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

/**
 * @author Jerome
 */
public class DaoSQLUtilisateurTest {

    private IDaoUtilisateur daoUtilisateur;
    private BeanFactory     bf;

    @Before
    public void init() {
        bf = new ClassPathXmlApplicationContext("classpath:spring-data.xml");
        daoUtilisateur = bf.getBean(IDaoUtilisateur.class);
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
