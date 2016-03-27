package fr.afcepf.atod26.jee.spring.banque.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessClient;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.Credit;
import fr.afcepf.atod26.java.spring.banque.entity.Debit;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

@ManagedBean
@SessionScoped
public class ManagedBeanInfosClient {

    private List<Compte>          lesCompte;

    @ManagedProperty(value = "#{businessClient}")
    private IBusinessClient       businessClient;

    @ManagedProperty(value = "#{managedBeanConnexionUtilisateur.utilisateurConnecte}")
    private Utilisateur           utilisateur;

    private int                   numeroCompte;

    private List<OperationCompte> lesOperationDuCompte;

    @PostConstruct
    public void init() {
        Client client = (Client) utilisateur;
        lesCompte = businessClient.getCompteByClient(client);
    }

    public String afficherLesOperations() {
        Compte compteSelectionne = null;
        for (Compte compte : lesCompte) {
            if (compte.getNumeroCompte() == numeroCompte) {
                compteSelectionne = compte;
            }
        }
        lesOperationDuCompte = businessClient.getOperationByCompte(compteSelectionne);
        return "";
    }

    public String test(OperationCompte op, String type) {
        if ("debit".equals(type)) {
            return op.getClass() == Debit.class ? op.getMontant() + "" : "";
        }
        if ("credit".equals(type)) {
            return op.getClass() == Credit.class ? op.getMontant() + "" : "";
        }
        return "";
    }

    public void setBusinessClient(IBusinessClient paramBusinessClient) {
        businessClient = paramBusinessClient;
    }

    public void setUtilisateur(Utilisateur paramUtilisateur) {
        utilisateur = paramUtilisateur;
    }

    public List<Compte> getLesCompte() {
        return lesCompte;
    }

    public void setLesCompte(List<Compte> paramLesCompte) {
        lesCompte = paramLesCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int paramNumeroCompte) {
        numeroCompte = paramNumeroCompte;
    }

    public List<OperationCompte> getLesOperationDuCompte() {
        return lesOperationDuCompte;
    }

    public void setLesOperationDuCompte(List<OperationCompte> paramLesOperationDuCompte) {
        lesOperationDuCompte = paramLesOperationDuCompte;
    }

}
