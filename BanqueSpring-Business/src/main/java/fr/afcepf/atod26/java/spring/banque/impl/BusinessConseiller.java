package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConseiller;
import fr.afcepf.atod26.java.spring.banque.api.IDaoCompte;
import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

@Service
public class BusinessConseiller implements IBusinessConseiller {

    private IDaoUtilisateur daoUtilisateur;

    private IDaoCompte      daoCompte;

    @Autowired
    public void setDaoUtilisateur(final IDaoUtilisateur paramDaoUtilisateur) {
        daoUtilisateur = paramDaoUtilisateur;
    }

    @Autowired
    public void setDaoCompte(final IDaoCompte paramDaoCompte) {
        daoCompte = paramDaoCompte;
    }

    @Override
    public Client insertClient(final Client paramClient) {
        return (Client) daoUtilisateur.insertUtilisateur(paramClient);
    }

    @Override
    public Compte insertCompte(final Compte paramCompte) {
        return daoCompte.insertCompte(paramCompte);
    }

    @Override
    public List<Client> getAllClient() {
        return daoUtilisateur.getAllClient();
    }

    @Override
    public List<Compte> getCompteByClient(final Client paramClient) {
        return daoCompte.getCompteByClient(paramClient);
    }

    @Override
    public List<Compte> getCompteByIdClient(final int paramIdClient) {
        return daoCompte.getCompteByIdClient(paramIdClient);
    }

}
