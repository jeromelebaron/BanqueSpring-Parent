package fr.afcepf.atod26.jee.spring.banque.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessConseiller;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Utilisateur;

@ManagedBean
@RequestScoped
public class ManagedBeanAjoutUtilisateur {

    private Utilisateur         nouvelUtilisateur = new Utilisateur();

    @ManagedProperty(value = "#{businessConseiller}")
    private IBusinessConseiller businessConseiller;

    public String ajouterUtilisateur() {
        businessConseiller.insertClient((Client) nouvelUtilisateur);
        return "";
    }

    public Utilisateur getNouvelUtilisateur() {
        return nouvelUtilisateur;
    }

    public void setNouvelUtilisateur(Utilisateur paramNouvelUtilisateur) {
        nouvelUtilisateur = paramNouvelUtilisateur;
    }

    public void setBusinessConseiller(IBusinessConseiller paramBusinessConseiller) {
        businessConseiller = paramBusinessConseiller;
    }

}
