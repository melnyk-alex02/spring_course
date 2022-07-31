package hibernateTest;

import hibernateTest.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
//        try {
//            Session session = sessionFactory.getCurrentSession();
//
//            Employee emp = session.get(Employee.class , 2);
//            Employee emp1 = new Employee("igor", "ivanov", 3 ,200);
//            Details details = new Details("dnipro", "123123123", ".....@gmail.com");
//
//
//            session.beginTransaction();
//            session.save(details);
//            session.getTransaction().commit();
//            System.out.println("Done");
//        }
//        finally {
//            sessionFactory.close();
        }
    }
