package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConnexion;
import fr.afcepf.atod26.java.spring.banque.api.IDaoUtilisateur;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

@Service
public class BusinessConnexion implements IBusinessConnexion {

    private IDaoUtilisateur daoUtilisateur;

    @Autowired
    public void setDaoUtilisateur(final IDaoUtilisateur paramDaoUtilisateur) {
        daoUtilisateur = paramDaoUtilisateur;
    }

    @Override
    public Utilisateur connexionUtilisateur(final String paramMail, final String paramMotDePasse) throws Exception {
        Utilisateur utilisateur = null;
        final List<Utilisateur> lesUtilisateur = daoUtilisateur.connexionUtilisateur(paramMail, paramMotDePasse);
        if (lesUtilisateur.size() == 1) {
            utilisateur = lesUtilisateur.get(0);
        } else {
            throw new Exception();
        }
        return utilisateur;
    }

}
