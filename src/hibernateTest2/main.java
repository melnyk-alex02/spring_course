package hibernateTest2;

import hibernateTest2.Entity.Details;
import hibernateTest2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("ola", "englund", 1, 200);
            Details det = new Details("kyiv", "380980447038", "alex.p.melnyk@gmail.com");
            emp.setEmpDetails(det);
            session.beginTransaction();
            session.save(det);
            session.getTransaction().commit();

            System.out.println("done");
        }
        finally{
            factory.close();
        }
    }
}
