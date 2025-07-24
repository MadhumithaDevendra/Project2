package createPerson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Person p1= new Person();
//		p1.setPid(101);
//		p1.setName("hruthvik");
//		
//		BloodGroup bg1= new BloodGroup();
//		bg1.setBgid(201);
//		bg1.setBgname("A+");
//		
//		p1.setBg(bg1);
//		
//		Person p2= new Person();
//		p2.setPid(102);
//		p2.setName("mithun");
//		
//		BloodGroup bg2= new BloodGroup();
//		bg2.setBgid(202);
//		bg2.setBgname("A-");
//		
//		p2.setBg(bg2);
//		
//		session.save(p1);
//		session.save(p2);
//		session.save(bg1);
//		session.save(bg2);
//		
//		transaction.commit();
//		session.close();
//		factory.close();
		
		//fetch data
	
		Person p=(Person)session.get(Person.class, 102);
		System.out.println(p.getName());
		System.out.println(p.getBg().getBgname());
		

	}

}
