package fr.afcepf.atod26.jee.spring.banque.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConnexion;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Conseiller;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;
import fr.afcepf.atod26.java.spring.banque.exception.BanqueException;

@ManagedBean(name = "managedBeanConnexionUtilisateur")
@SessionScoped
public class ManagedBeanConnexionUtilisateur {

    private static final Logger LOG = Logger.getLogger(ManagedBeanConnexionUtilisateur.class);

    private String              mail;

    private String              motDePasse;

    private Utilisateur         utilisateurConnecte;

    private String              message;

    @ManagedProperty(value = "#{businessConnexion}")
    private IBusinessConnexion  businessConnexion;

    public String connexion() {
        String redirection = "";
        try {
            utilisateurConnecte = businessConnexion.connexionUtilisateur(mail, motDePasse);
            if (utilisateurConnecte.getClass() == Client.class) {
                redirection = "detailclient.jsf?faces-redirect=true";
            } else if (utilisateurConnecte.getClass() == Conseiller.class) {
                redirection = "detailconseiller.jsf?faces-redirect=true";
            }
        } catch (BanqueException e) {
            LOG.debug(e);
            message = "Login ou mot de passe erroné";
        }
        return redirection;
    }

    public String deconnexion() {
        utilisateurConnecte = null;
        return "";
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String paramMail) {
        mail = paramMail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String paramMotDePasse) {
        motDePasse = paramMotDePasse;
    }

    public Utilisateur getUtilisateurConnecte() {
        return utilisateurConnecte;
    }

    public void setUtilisateurConnecte(Utilisateur paramUtilisateurConnecte) {
        utilisateurConnecte = paramUtilisateurConnecte;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String paramMessage) {
        message = paramMessage;
    }

    public void setBusinessConnexion(IBusinessConnexion paramBusinessConnexion) {
        businessConnexion = paramBusinessConnexion;
    }

}
