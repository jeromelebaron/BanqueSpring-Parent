/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConnexion;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

/**
 * @author Jerome
 *
 */
public class BusinessConnexionTest {

	private IBusinessConnexion businessConnexion;

	@Before
	public void init() {
		BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring-business.xml");
		businessConnexion = bf.getBean(IBusinessConnexion.class);
	}
	
	/**
	 * Test method for
	 * {@link fr.afcepf.atod26.java.spring.banque.impl.BusinessConnexion#connexionUtilisateur(java.lang.String, java.lang.String)}
	 * 
	 * @throws Exception
	 */
	@Test
	public void testConnexionUtilisateur() throws Exception {

		Utilisateur utilisateurAttendu = businessConnexion.connexionUtilisateur("clien1@mabanque.spring", "12345");

		int idUtilisateurAttendu = 1;
		int idUtilisateurTrouve = utilisateurAttendu.getIdUtilisateur();

		Assert.assertEquals("Vérification de l'id récupéré de l'utilisateur", idUtilisateurAttendu,
				idUtilisateurTrouve);
	}

}
