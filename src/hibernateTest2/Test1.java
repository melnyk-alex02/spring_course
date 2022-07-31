package hibernateTest2;

import hibernateTest2.Entity.Details;
import hibernateTest2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try{
             session = factory.getCurrentSession();
            Employee emp1 = new Employee("nikola", "tesla", 5,  700);
            Details det = new Details("bangladesh", "321321321321", ".........@gmail.com");
//            emp1.setEmpDetails(det);
            det.setEmployee(emp1);
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
