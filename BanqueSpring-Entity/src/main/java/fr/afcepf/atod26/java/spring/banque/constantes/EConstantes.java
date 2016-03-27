/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.constantes;

/**
 * @author Jerome
 */
public enum EConstantes {

    CREDIT("credit");

    private final String contenu;

    /**
     * @param paramContenu
     */
    private EConstantes(String paramContenu) {
        contenu = paramContenu;
    }

    /**
     * @return the contenu
     */
    public String getContenu() {
        return contenu;
    }

}
