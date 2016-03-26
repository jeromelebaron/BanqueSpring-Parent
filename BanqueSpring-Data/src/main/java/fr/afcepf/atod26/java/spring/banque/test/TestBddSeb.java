package fr.afcepf.atod26.java.spring.banque.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.afcepf.atod26.java.spring.banque.entity.Client;
import fr.afcepf.atod26.java.spring.banque.entity.Compte;
import fr.afcepf.atod26.java.spring.banque.entity.Conseiller;
import fr.afcepf.atod26.java.spring.banque.entity.Credit;
import fr.afcepf.atod26.java.spring.banque.entity.Debit;
import fr.afcepf.atod26.java.spring.banque.entity.OperationCompte;

public class TestBddSeb {

    private static final String CODE           = "12345";

    private static final String COMPTE_COURANT = "Courant";

    private TestBddSeb() {
    }

    public static void main(final String[] args) {
        final BeanFactory bf = new ClassPathXmlApplicationContext("classpath:spring-data.xml");
        final SessionFactory sf = bf.getBean(SessionFactory.class);
        final Session session = sf.openSession();
        final Transaction tx = session.beginTransaction();
        final Client client1 = new Client(null, "Client 1", "prenom client 1", "clien1@mabanque.spring", CODE);
        final Client client2 = new Client(null, "Client 2", "prenom client 2", "clien2@mabanque.spring", CODE);
        final Client client3 = new Client(null, "Client 3", "prenom client 3", "clien3@mabanque.spring", CODE);
        final Client client4 = new Client(null, "Client 4", "prenom client 4", "clien4@mabanque.spring", CODE);
        final Conseiller conseiller1 = new Conseiller(null, "conseiller1", "conseil", "conseil1@mabanque.spring", CODE);
        final Conseiller conseiller2 = new Conseiller(null, "conseiller2", "conseil2", "conseil2@mabanque.spring", CODE);
        final Compte c1 = new Compte(null, COMPTE_COURANT, new Date(), client1);
        final Compte c2 = new Compte(null, COMPTE_COURANT, new Date(), client1);
        final Compte c3 = new Compte(null, COMPTE_COURANT, new Date(), client2);
        final Compte c4 = new Compte(null, COMPTE_COURANT, new Date(), client2);
        final Compte c5 = new Compte(null, COMPTE_COURANT, new Date(), client2);
        final Compte c6 = new Compte(null, COMPTE_COURANT, new Date(), client3);
        final Compte c7 = new Compte(null, COMPTE_COURANT, new Date(), client4);
        final Compte c8 = new Compte(null, COMPTE_COURANT, new Date(), client4);
        final Compte c9 = new Compte(null, COMPTE_COURANT, new Date(), client4);
        final Compte c10 = new Compte(null, COMPTE_COURANT, new Date(), client4);
        final List<OperationCompte> ops = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c1, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c1, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c2, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c2, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c3, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c3, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c4, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c4, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c5, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c5, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c6, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c6, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c7, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c7, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c8, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c8, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c9, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c9, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        for (int i = 0; i < 20; i++) {
            final double montant = Math.random() * 1500.0;
            if (i % 2 == 0) {
                ops.add(new Debit(c10, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            } else {
                ops.add(new Credit(c10, Double.parseDouble(String.valueOf(montant).substring(0, String.valueOf(montant).indexOf('.') + 2)),
                        new Date()));
            }
        }
        session.save(client1);
        session.save(client2);
        session.save(client3);
        session.save(client4);

        session.save(conseiller1);
        session.save(conseiller2);

        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        session.save(c5);
        session.save(c6);
        session.save(c7);
        session.save(c8);
        session.save(c9);
        session.save(c10);

        for (final OperationCompte operation : ops) {
            session.save(operation);
        }
        tx.commit();
        session.close();
    }
}
