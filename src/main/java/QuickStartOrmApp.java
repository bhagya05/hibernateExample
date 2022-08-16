

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import com.tut.Address;
import com.tut.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuickStartOrmApp {


    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Configuration cnf = new Configuration().configure();
        SessionFactory sessionFactory = cnf.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        Student student = new Student("Bhagya","Pune");


        //Address
        Address address = new Address();
        address.setCity("Jabalpur");
        address.setStreet("House no. 804/1");
        address.setX(10.0);
        address.setOpen(true);
        address.setAddedDate(new Date());
        //Reading image
        InputStream inputStream = new FileInputStream("src/main/resources/pic.jpeg");
        byte imageByte[] = inputStream.readAllBytes();
        address.setImage(imageByte);



        session.save(address);
        session.save(student);
        transaction.commit();
        session.close();
    }
}
