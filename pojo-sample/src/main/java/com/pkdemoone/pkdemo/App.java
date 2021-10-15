package com.pkdemoone.pkdemo;







/**
 * Using hibernate with java application
 * sample code
 * https://github.com/navinreddy20?tab=repositories
 * https://www.youtube.com/watch?v=JR7-EdxDSf0&t=4534s
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        //Save data in database
/*        Alien telsusko = new Alien();
        
        AlienName an = new AlienName();
        an.setFname("purab");
        an.setMname("dayanand");
        an.setLname("kharat");
        
        telsusko.setAid(102);

        telsusko.setAname(an);
        telsusko.setColor("blue");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);        
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf= con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
       Transaction tx = session.beginTransaction();
        
        session.save(telsusko);
        
        telsusko = (Alien) session.get(Alien.class, 102);
        
        tx.commit();
        
        //fetching data from data
        
        System.out.println(telsusko);	*/
        
        //Relational mapping (student and laptop = many to many)
        
        //Mapping - OneToOne, ManyToOne, OneToMany, ManyToMany
        
/*        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");
        
        
        Student s = new Student();
        s.setName("navin");
        s.setRollno(1);
        s.setMarks(50);
        s.getLaptop().add(laptop);
        
        laptop.getStudent().add(s);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(registry);
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        session.save(laptop);
        session.save(s);
        
        session.getTransaction().commit();	*/
        
      //Caching sql query 
        
/*        Alien a = null;
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(registry);
        Session session = sf.openSession();        
        session.beginTransaction();
        
        Query q1 = session.createQuery("from Alien where aid=101");
        q1.setCacheable(true);
        a = (Alien) q1.uniqueResult();
        System.out.println(a);
       
        a = (Alien) session.get(Alien.class,101);
        System.out.println(a);
        session.getTransaction().commit();
        session.close();
        
        Session session1 = sf.openSession();        
        session1.beginTransaction();
        
        a = (Alien) session1.get(Alien.class,101);
        System.out.println(a);
        session1.getTransaction().commit();
        session1.close();	*/
        
        // JPA - Entity Manager
        
        Alien a = new Alien();
        AlienName an = new AlienName();
        an.setFname("purab");
        an.setMname("dayanand");
        an.setLname("kharat");
        
        a.setAid(102);
        a.setAname(an);
        a.setColor("blue");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em =  emf.createEntityManager();
        
        Alien a1 = em .find(Alien.class, 102);
        System.out.println(a1);
       
        
        
    }
}
