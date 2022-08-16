package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmbedDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Student student = new Student("Bhagya","Pune");
        Certificate certificate = new Certificate("Computer Science","100 month");
        student.setCertificate(certificate);

        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        sessionFactory.close();
    }
}
