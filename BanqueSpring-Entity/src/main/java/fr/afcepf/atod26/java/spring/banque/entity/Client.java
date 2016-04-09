package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "client")
public class Client extends Utilisateur {

    /**
     * Tous les {@link Compte} du client.
     */
    @OneToMany(mappedBy = "client")
    private List<Compte> lesCompte;

    /**
     * Constructeur vide.
     */
    public Client() {
        super();
    }

    /**
     * Constructeur plein.
     * @param paramIdUtilisateur l'id de l'utilisateur.
     * @param paramNom le nom de l'utilisateur.
     * @param paramPrenom le prenom de l'utilisateur.
     * @param paramMail le mail de l'utilisateur
     * @param paramMotDePasse le mot de passe de l'utilisateur.
     */
    public Client(final Integer paramIdUtilisateur, final String paramNom, final String paramPrenom, final String paramMail,
            final String paramMotDePasse) {
        super(paramIdUtilisateur, paramNom, paramPrenom, paramMail, paramMotDePasse);
    }

    /**
     * Constructeur sans id.
     * @param paramNom le nom de l'utilisateur.
     * @param paramPrenom le prenom de l'utilisateur.
     * @param paramMail le mail de l'utilisateur
     * @param paramMotDePasse le mot de passe de l'utilisateur.
     */
    public Client(final String paramNom, final String paramPrenom, final String paramMail, final String paramMotDePasse) {
        super(paramNom, paramPrenom, paramMail, paramMotDePasse);
    }

    public List<Compte> getLesCompte() {
        return lesCompte;
    }

    public void setLesCompte(final List<Compte> paramLesCompte) {
        lesCompte = paramLesCompte;
    }

}
