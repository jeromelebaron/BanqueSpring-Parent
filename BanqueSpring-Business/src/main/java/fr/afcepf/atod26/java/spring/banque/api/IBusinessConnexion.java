package fr.afcepf.atod26.java.spring.banque.api;

import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

public interface IBusinessConnexion {

    Utilisateur connexionUtilisateur(String paramMail, String paramMotDePasse) throws Exception;
}
