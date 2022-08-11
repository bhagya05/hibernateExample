import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class QuickStartOrmApp {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();


        System.out.println("Connected to the YugabyteDB Cluster successfully.");
        EmployeeDAO employeeDAO = new EmployeeDAO(session);
        // Save an employee
        employeeDAO.save(new Employee("Bhagya",10,"English"));


        // Find the employee
        Employee employee;
        if(employeeDAO.findById(1).isPresent())
        {
            employee = employeeDAO.findById(1).get();
        }
        else employee = null;

        System.out.println("Query Returned:" + employee);


        }
}
