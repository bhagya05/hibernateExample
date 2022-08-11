import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;

import java.util.Optional;

public class EmployeeDAO {

    Session hibernateSession;

    public EmployeeDAO (Session session) {
        hibernateSession = session;
    }

    public void save(final Employee employeeEntity) {
        Transaction transaction = hibernateSession.beginTransaction();
        try {
            hibernateSession.save(employeeEntity);
            transaction.commit();
        } catch(RuntimeException rte) {
            transaction.rollback();
        }
    }

    public Optional<Employee> findById(final Integer id) {

        return Optional.ofNullable(hibernateSession.find(Employee.class, 1));

    }
}
