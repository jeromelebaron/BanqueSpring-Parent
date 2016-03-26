package fr.afcepf.atod26.java.spring.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "conseiller")
public class Conseiller extends Utilisateur {

    /**
     * Constructeur vide.
     */
    public Conseiller() {
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
    public Conseiller(final Integer paramIdUtilisateur, final String paramNom, final String paramPrenom, final String paramMail,
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
    public Conseiller(final String paramNom, final String paramPrenom, final String paramMail, final String paramMotDePasse) {
        super(paramNom, paramPrenom, paramMail, paramMotDePasse);
    }

}
