package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "debit")
public class Debit extends OperationCompte {

    /**
     * Consctructeu vide.
     */
    public Debit() {
        super();
    }

    /**
     * Constructeur sans numéro d'opération.
     * @param paramCompte
     * @param paramMontant
     * @param paramDateOperation
     */
    public Debit(final Compte paramCompte, final Double paramMontant, final Date paramDateOperation) {
        super(paramCompte, paramMontant, paramDateOperation);
    }

    /**
     * Consctruteur plein.
     * @param paramCompte
     * @param paramNumeroOperation
     * @param paramMontant
     * @param paramDateOperation
     */
    public Debit(final Compte paramCompte, final Integer paramNumeroOperation, final Double paramMontant, final Date paramDateOperation) {
        super(paramCompte, paramNumeroOperation, paramMontant, paramDateOperation);
    }

}
