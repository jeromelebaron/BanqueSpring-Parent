package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "operation_compte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_operation")
public class OperationCompte {

    /**
     * Le {@link Compte} auquel est liée l'opération.
     */
    @ManyToOne
    @JoinColumn(name = "compte", nullable = false)
    private Compte  compte;
    /**
     * Le numéro de l'opération
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_operation")
    private Integer numeroOperation;
    /**
     * La valeur de l'opération.
     */
    @Column(name = "montant", nullable = false)
    private Double  montant;
    /**
     * La date de l'opération.
     */
    @Column(name = "date_operation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date    dateOperation;

    /**
     * Constructeur vide.
     */
    public OperationCompte() {
    }

    /**
     * Constructeur sans numéro d'opération.
     * @param paramCompte
     * @param paramMontant
     * @param paramDateOperation
     */
    public OperationCompte(final Compte paramCompte, final Double paramMontant, final Date paramDateOperation) {
        compte = paramCompte;
        montant = paramMontant;
        dateOperation = paramDateOperation;
    }

    /**
     * Constructeur plein.
     * @param paramCompte
     * @param paramNumeroOperation
     * @param paramMontant
     * @param paramDateOperation
     */
    public OperationCompte(final Compte paramCompte, final Integer paramNumeroOperation, final Double paramMontant,
            final Date paramDateOperation) {
        this(paramCompte, paramMontant, paramDateOperation);
        numeroOperation = paramNumeroOperation;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(final Compte paramCompte) {
        compte = paramCompte;
    }

    public Integer getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(final Integer paramNumeroOperation) {
        numeroOperation = paramNumeroOperation;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(final Double paramMontant) {
        montant = paramMontant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(final Date paramDateOperation) {
        dateOperation = paramDateOperation;
    }

}
