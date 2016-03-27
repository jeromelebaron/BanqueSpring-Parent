package fr.afcepf.atod26.jee.spring.banque.managedbean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.afcepf.atod26.java.spring.banque.api.IBusinessClient;
import fr.afcepf.atod26.java.spring.banque.api.IBusinessConseiller;
import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.Credit;
import fr.afcepf.atod26.java.spring.banque.entity.Debit;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

@ManagedBean
@SessionScoped
public class ManagedBeanConseiller {

    private List<Client>          lesClient;

    @ManagedProperty(value = "#{businessConseiller}")
    private IBusinessConseiller   businessConseiller;

    @ManagedProperty(value = "#{businessClient}")
    private IBusinessClient       businessClient;

    private List<Compte>          lesCompteDuClient;

    private int                   numeroCompte;

    private List<OperationCompte> lesOperationDuCompte;

    @PostConstruct
    public void init() {
        lesClient = businessConseiller.getAllClient();
    }

    public String detailsClient(int paramIdUtilisateur) {
        lesCompteDuClient = businessConseiller.getCompteByIdClient(paramIdUtilisateur);
        return "";
    }

    public String voirLesOperation() {
        Compte compte = null;
        for (Compte localCompte : lesCompteDuClient) {
            if (localCompte.getNumeroCompte() == numeroCompte) {
                compte = localCompte;
            }
        }
        lesOperationDuCompte = businessClient.getOperationByCompte(compte);
        return "";
    }

    public String test(OperationCompte op, String type) {
        if ("debit".equals(type)){
            return op.getClass() == Debit.class ? op.getMontant() + "" : "";
        }
        if ("credit".equals(type)){
            return op.getClass() == Credit.class ? op.getMontant() + "" : "";
        }
        return "";
    }

    public List<Client> getLesClient() {
        return lesClient;
    }

    public void setLesClient(List<Client> paramLesClient) {
        lesClient = paramLesClient;
    }

    public void setBusinessConseiller(IBusinessConseiller paramBusinessConseiller) {
        businessConseiller = paramBusinessConseiller;
    }

    public void setBusinessClient(IBusinessClient paramBusinessClient) {
        businessClient = paramBusinessClient;
    }

    public List<Compte> getLesCompteDuClient() {
        return lesCompteDuClient;
    }

    public void setLesCompteDuClient(List<Compte> paramLesCompteDuClient) {
        lesCompteDuClient = paramLesCompteDuClient;
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
