package fr.afcepf.atod26.java.spring.banque.api;

import java.util.List;

import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

public interface IBusinessConseiller {

    Client insertClient(Client paramClient);

    Compte insertCompte(Compte paramCompte);

    List<Client> getAllClient();

    List<Compte> getCompteByClient(Client paramClient);

    List<Compte> getCompteByIdClient(int paramIdClient);

}
