package fr.afcepf.atod26.java.spring.banque.api;

import java.util.List;

import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

public interface IDaoCompte {

    List<Compte> getCompteByClient(Client paramClient);

    Compte insertCompte(Compte paramCompte);

    List<Compte> getCompteByIdClient(int paramIdClient);

}
