package fr.afcepf.atod26.java.spring.banque.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod26.java.spring.banque.api.IDaoOperation;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

@Service
public class DaoSQLOperation implements IDaoOperation {

    private HibernateTemplate   hbTemplate;

    private static final String REQUETE_GET_OPERATION_BY_ID_COMPTE = "SELECT o FROM OperationCompte o WHERE o.compte = :paramCompte";

    @Override
    @Transactional
    public List<OperationCompte> getOperationByCompte(final Compte paramCompte) {
        final String[] lesParam = { "paramCompte" };
        final Object[] lesValeurs = { paramCompte };
        return (List) hbTemplate.findByNamedParam(REQUETE_GET_OPERATION_BY_ID_COMPTE, lesParam, lesValeurs);
    }

    @Override
    @Transactional
    public OperationCompte insertOperation(final OperationCompte paramOperation) {
        hbTemplate.save(paramOperation);
        return paramOperation;
    }

    @Autowired
    public void setSessionFactory(final SessionFactory paramSessionFactory) {
        hbTemplate = new HibernateTemplate(paramSessionFactory);
    }
}
