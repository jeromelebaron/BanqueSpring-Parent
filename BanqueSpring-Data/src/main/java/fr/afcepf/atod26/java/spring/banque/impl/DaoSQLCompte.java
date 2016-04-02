package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod26.java.spring.banque.api.IDaoCompte;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;

@Service
public class DaoSQLCompte implements IDaoCompte {

    private static final String REQUETE_GET_COMPTE_BY_CLIENT    = "SELECT c FROM Compte c WHERE c.client = :paramClient";

    private static final String REQUETE_GET_COMPTE_BY_ID_CLIENT = "SELECT c FROM Compte c WHERE c.client.idUtilisateur = :paramIdClient";

    private HibernateTemplate   hbTemplate;

    @Override
    @Transactional
    public List<Compte> getCompteByClient(final Client paramClient) {
        final String[] lesParam = { "paramClient" };
        final Object[] lesValeurs = { paramClient };
        return (List) hbTemplate.findByNamedParam(REQUETE_GET_COMPTE_BY_CLIENT, lesParam, lesValeurs);
    }

    @Override
    @Transactional
    public List<Compte> getCompteByIdClient(final int paramIdClient) {
        final String[] lesParam = { "paramIdClient" };
        final Object[] lesValeurs = { paramIdClient };
        return (List) hbTemplate.findByNamedParam(REQUETE_GET_COMPTE_BY_ID_CLIENT, lesParam, lesValeurs);
    }

    @Override
    @Transactional
    public Compte insertCompte(final Compte paramCompte) {
        hbTemplate.save(paramCompte);
        return paramCompte;
    }

    @Autowired
    public void setSessionFactory(final SessionFactory paramSessionFactory) {
        hbTemplate = new HibernateTemplate(paramSessionFactory);
    }
}
