package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.Set;

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
    private Set<Compte> lesCompte;

    /**
     * Constructeur vide.
     */
    public Client() {
        super();
    }

    /**
     * Constructeur plein.
     * @param paramIdUtilisateur
     * @param paramNom
     * @param paramPrenom
     * @param paramMail
     * @param paramMotDePasse
     */
    public Client(final Integer paramIdUtilisateur, final String paramNom, final String paramPrenom, final String paramMail,
            final String paramMotDePasse) {
        super(paramIdUtilisateur, paramNom, paramPrenom, paramMail, paramMotDePasse);
    }

    /**
     * Constructeur sans id.
     * @param paramNom
     * @param paramPrenom
     * @param paramMail
     * @param paramMotDePasse
     */
    public Client(final String paramNom, final String paramPrenom, final String paramMail, final String paramMotDePasse) {
        super(paramNom, paramPrenom, paramMail, paramMotDePasse);
    }

    public Set<Compte> getLesCompte() {
        return lesCompte;
    }

    public void setLesCompte(final Set<Compte> paramLesCompte) {
        lesCompte = paramLesCompte;
    }

}
