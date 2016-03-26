package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "credit")
public class Credit extends OperationCompte {

    /**
     * Constructeur vide.
     */
    public Credit() {
        super();
    }

    /**
     * Constructeur sans numéro d'opération.
     * @param paramCompte
     * @param paramMontant
     * @param paramDateOperation
     */
    public Credit(final Compte paramCompte, final Double paramMontant, final Date paramDateOperation) {
        super(paramCompte, paramMontant, paramDateOperation);
    }

    /**
     * Constructeur plein.
     * @param paramCompte
     * @param paramNumeroOperation
     * @param paramMontant
     * @param paramDateOperation
     */
    public Credit(final Compte paramCompte, final Integer paramNumeroOperation, final Double paramMontant, final Date paramDateOperation) {
        super(paramCompte, paramNumeroOperation, paramMontant, paramDateOperation);
    }

}
