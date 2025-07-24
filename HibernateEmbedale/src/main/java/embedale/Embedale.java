package embedale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedale {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("jeevan");
		s1.setContact(1234567890L);
		
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("keerthana");
		s2.setContact(4444567890L);
		
		Course c1= new Course();
		c1.setCid(201);
		c1.setCname("java");
		c1.setCduration("10days");
		
		Course c2= new Course();
		c2.setCid(202);
		c2.setCname("python");
		c2.setCduration("20days");
		
		s1.setCourse(c1);
		s2.setCourse(c2);
		
		session.save(s1);
		session.save(s2);
		
		
		transaction.commit();
		session.close();
		factory.close();

//		Student s=(Student)session.get(Student.class, 101);
//		System.out.println(s.getSid());
//		System.out.println(s.getSname());
//		System.out.println(s.getContact());
//		System.out.println(s.getCourse().getCid());
//		System.out.println(s.getCourse().getCname());
//		System.out.println(s.getCourse().getCduration());
	}

}
