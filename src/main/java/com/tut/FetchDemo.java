package com.tut;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class FetchDemo {
    public static void main(String[] args) {
        //get and load example
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        //Get Student

        // Returns null if not present
        Student student = session.get(Student.class,3);


        // Throws ObjectNotFound error if not present
        Address address = session.load(Address.class,101);
        System.out.println(address);
        System.out.println(student);

    }
}
