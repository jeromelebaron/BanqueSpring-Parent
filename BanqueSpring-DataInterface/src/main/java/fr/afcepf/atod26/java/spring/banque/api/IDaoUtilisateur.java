package fr.afcepf.atod26.java.spring.banque.api;

import java.util.List;

import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

public interface IDaoUtilisateur {

    Utilisateur insertUtilisateur(Utilisateur paramUtilisateur);

    List<Utilisateur> connexionUtilisateur(String paramMail, String paramMotDePasse);

    List<Client> getAllClient();

}
