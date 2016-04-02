package fr.afcepf.atod26.java.spring.banque.api;

import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;
import fr.afcepf.atod26.java.spring.banque.exception.BanqueException;

public interface IBusinessConnexion {

    Utilisateur connexionUtilisateur(String paramMail, String paramMotDePasse) throws BanqueException;
}
