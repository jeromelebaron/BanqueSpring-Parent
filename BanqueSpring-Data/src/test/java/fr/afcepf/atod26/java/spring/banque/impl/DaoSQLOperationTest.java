/**
 * 
 */
package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.atod26.java.spring.banque.api.IDaoOperation;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

/**
 * @author Jerome
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-data-test.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DaoSQLOperationTest {

    @Autowired
    private IDaoOperation daoOperation;
    
    @Test
    public void testANotNull(){
        Assert.assertNotNull(daoOperation);
    }
    
    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLOperation#getOperationByCompte(fr.afcepf.atod26.java.spring.banque.entity.Compte)}
     * .
     */
    @Test
    public void testBGetOperationByCompte() {
        Compte compteAvecOperation = new Compte(1, null, null, null);
        List<OperationCompte> lesOperationDuCompte = daoOperation.getOperationByCompte(compteAvecOperation);
        int nbOperationDuCompte = lesOperationDuCompte.size();
        
        int nbOperationAttendu = 20;
        
        Assert.assertEquals("Vérification du nombre d'opération pour ce compte", nbOperationAttendu, nbOperationDuCompte);
    }

    /**
     * Test method for
     * {@link fr.afcepf.atod26.java.spring.banque.impl.DaoSQLOperation#insertOperation(fr.afcepf.atod26.java.spring.banque.entity.OperationCompte)}
     * .
     */
    @Test
    public void testCInsertOperation() {
        OperationCompte nouvelleOperationCompte = new OperationCompte(new Compte(1, null, null, null), 125.5, new Date());
        daoOperation.insertOperation(nouvelleOperationCompte);
        
        int idNouvelleOperationAttendu = 201;
        
        Assert.assertEquals("Vérification de l'insertion de l'opération", idNouvelleOperationAttendu, nouvelleOperationCompte.getNumeroOperation().intValue());
    }

}
