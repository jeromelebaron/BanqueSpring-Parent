package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessClient;
import fr.afcepf.atod26.java.spring.banque.api.IDaoCompte;
import fr.afcepf.atod26.java.spring.banque.api.IDaoOperation;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

@Service
public class BusinessClient implements IBusinessClient {

    private IDaoCompte    daoCompte;

    private IDaoOperation daoOperation;

    @Autowired
    public void setDaoCompte(final IDaoCompte paramDaoCompte) {
        daoCompte = paramDaoCompte;
    }

    @Autowired
    public void setDaoOperation(final IDaoOperation paramDaoOperation) {
        daoOperation = paramDaoOperation;
    }

    @Override
    public List<Compte> getCompteByClient(final Client paramClient) {
        return daoCompte.getCompteByClient(paramClient);
    }

    @Override
    public List<OperationCompte> getOperationByCompte(final Compte paramCompte) {
        return daoOperation.getOperationByCompte(paramCompte);
    }

}
