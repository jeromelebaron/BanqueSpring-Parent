package fr.afcepf.atod26.java.spring.banque.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_utilisateur")
public class Utilisateur {

    /**
     * L'identifiant unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Integer idUtilisateur;
    /**
     * Le nom de l'utilisateur.
     */
    @Column(name = "nom", length = 45, nullable = false)
    private String  nom;
    /**
     * Le prénom de l'utilisateur.
     */
    @Column(name = "prenom", length = 45, nullable = false)
    private String  prenom;
    /**
     * Le mail de l'utilisateur.
     */
    @Column(name = "mail", length = 45, nullable = false)
    private String  mail;
    /**
     * Le mot de passe de l'utilisateur.
     */
    @Column(name = "mot_de_passe", length = 45, nullable = false)
    private String  motDePasse;

    /**
     * Constructeur vide.
     */
    public Utilisateur() {
    }

    /**
     * Constructeur sand id.
     * @param paramNom
     * @param paramPrenom
     * @param paramMail
     * @param paramMotDePasse
     */
    public Utilisateur(final String paramNom, final String paramPrenom, final String paramMail, final String paramMotDePasse) {
        super();
        nom = paramNom;
        prenom = paramPrenom;
        mail = paramMail;
        motDePasse = paramMotDePasse;
    }

    /**
     * Constructeur plein.
     * @param paramIdUtilisateur
     * @param paramNom
     * @param paramPrenom
     * @param paramMail
     * @param paramMotDePasse
     */
    public Utilisateur(final Integer paramIdUtilisateur, final String paramNom, final String paramPrenom, final String paramMail,
            final String paramMotDePasse) {
        this(paramNom, paramPrenom, paramMail, paramMotDePasse);
        idUtilisateur = paramIdUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(final Integer paramIdUtilisateur) {
        idUtilisateur = paramIdUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String paramNom) {
        nom = paramNom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String paramPrenom) {
        prenom = paramPrenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(final String paramMail) {
        mail = paramMail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(final String paramMotDePasse) {
        motDePasse = paramMotDePasse;
    }

}
