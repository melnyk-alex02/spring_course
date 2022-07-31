package hibernateTest;

        import hibernateTest.entity.Employee;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
//        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee emp = new Employee("sasha", "melnyk", 1, 500.4);
//            Employee emp1 = new Employee("pasha", "pes", 1, 500);
//            session.beginTransaction();
//            session.save(emp1);
//            session.getTransaction().commit();
//            System.out.println("Done");
//        }
//        finally {
//            sessionFactory.close();
//        }
    }
}
