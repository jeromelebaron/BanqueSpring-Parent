package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

@Service
public class DaoSQLUtilisateur implements IDaoUtilisateur {

    private HibernateTemplate   hbTemplate;

    private static final String REQUETE_CONNEXION_UTILISATEUR = "SELECT u FROM Utilisateur u WHERE u.mail = :paramMail AND u.motDePasse = :paramMotDePasse";

    @Autowired
    public void setSessionFactory(final SessionFactory paramSessionFactory) {
        hbTemplate = new HibernateTemplate(paramSessionFactory);
    }

    @Override
    @Transactional
    public Utilisateur insertUtilisateur(final Utilisateur paramUtilisateur) {
        hbTemplate.save(paramUtilisateur);
        return paramUtilisateur;
    }

    @Override
    @Transactional
    public List<Utilisateur> connexionUtilisateur(final String paramMail, final String paramMotDeOasse) {
        final String[] lesParam = { "paramMail", "paramMotDePasse" };
        final Object[] lesValeurs = { paramMail, paramMotDeOasse };
        return (List) hbTemplate.findByNamedParam(REQUETE_CONNEXION_UTILISATEUR, lesParam, lesValeurs);
    }

    @Override
    public List<Client> getAllClient() {
        return hbTemplate.loadAll(Client.class);
    }

}
