package fr.afcepf.atod26.java.spring.banque.api;

import java.util.List;

import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

public interface IBusinessClient {

    List<Compte> getCompteByClient(Client client);

    List<OperationCompte> getOperationByCompte(Compte paramCompte);
}
