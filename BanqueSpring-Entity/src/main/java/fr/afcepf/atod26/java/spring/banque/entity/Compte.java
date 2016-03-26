package fr.afcepf.atod26.java.spring.banque.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {

	/**
	 * Identifiant unique du compte.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_compte")
	private Integer numeroCompte;
	/**
	 * Le type du compte :
	 * <ul>
	 * <li>Compte chèque</li>
	 * <li>Livret A</li>
	 * <li>LDD</li>
	 * </ul>
	 */
	@Column(name = "type_de_compte", length = 45, nullable = false)
	private String typeDeCompte;
	/**
	 * La date de création du compte.
	 */
	@Column(name = "date_de_creation", nullable = false)
	private Date dateDeCreation;
	/**
	 * La liste des {@link OperationCompte} liées à ce compte
	 */
	@OneToMany(mappedBy = "compte")
	private Set<OperationCompte> lesOperation;
	/**
	 * Le {@link Client} à qui appartient le compte.
	 */
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Client client;

	/**
	 * Constructeur vide.
	 */
	public Compte() {
	}

	/**
	 * Constructeur plein.
	 * 
	 * @param paramNumero
	 * @param paramTypeDeCompte
	 * @param paramDateDeCreation
	 * @param paramLesOperation
	 * @param paramClient
	 */
	public Compte(final Integer paramNumero, final String paramTypeDeCompte, final Date paramDateDeCreation,
			final Client paramClient) {
		super();
		numeroCompte = paramNumero;
		typeDeCompte = paramTypeDeCompte;
		dateDeCreation = paramDateDeCreation;
		client = paramClient;
	}

	public Integer getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(final Integer paramNumeroCompte) {
		numeroCompte = paramNumeroCompte;
	}

	public String getTypeDeCompte() {
		return typeDeCompte;
	}

	public void setTypeDeCompte(final String paramTypeDeCompte) {
		typeDeCompte = paramTypeDeCompte;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(final Date paramDateDeCreation) {
		dateDeCreation = paramDateDeCreation;
	}

	public Set<OperationCompte> getLesOperation() {
		return lesOperation;
	}

	public void setLesOperation(final Set<OperationCompte> paramLesOperation) {
		lesOperation = paramLesOperation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(final Client paramClient) {
		client = paramClient;
	}

}
