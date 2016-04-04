package fr.afcepf.atod26.java.spring.banque.api;

import java.util.List;

import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

public interface IDaoOperation {

    OperationCompte insertOperation(OperationCompte paramOperation);

    List<OperationCompte> getOperationByCompte(Compte paramCompte);

}
