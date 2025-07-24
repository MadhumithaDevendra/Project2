package manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DevPro {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Developer d1= new Developer();
//		d1.setDid(101);
//		d1.setDname("ram");
//		
//		Developer d2= new Developer();
//		d2.setDid(102);
//		d2.setDname("nithin");
//		
//		List<Developer> dl= new ArrayList<Developer>();
//		dl.add(d1);
//		dl.add(d2);
//		
//		Project p1= new Project();
//		p1.setPid(201);
//		p1.setPname("ecommerce");
//		
//		Project p2= new Project();
//		p2.setPid(202);
//		p2.setPname("banking");
//		
//		Project p3= new Project();
//		p3.setPid(203);
//		p3.setPname("mobile application");
//		
//		Project p4= new Project();
//		p4.setPid(204);
//		p4.setPname("website");
//		
//		List<Project> pl= new ArrayList<Project>();
//		pl.add(p1);
//		pl.add(p2);
//		pl.add(p3);
//		pl.add(p4);
//		
//		d1.setProject(pl);
//		d2.setProject(pl);
//		
//		p1.setDeveloper(dl);
//		p2.setDeveloper(dl);
//		p3.setDeveloper(dl);
//		p4.setDeveloper(dl);
//		
//		
//		session.save(d1);
//		session.save(d2);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
//		
//		transaction.commit();
//		session.close();
//		factory.close();
		
		Developer d=(Developer)session.get(Developer.class, 101);
		System.out.println(d.getDname());
		for(Project p: d.getProject()) {
			System.out.println(p.getPname());
		}
		System.out.println("***************");
		Project p =(Project)session.get(Project.class, 204);
		System.out.println(p.getPname());
		for(Developer de: p.getDeveloper()) {
			System.out.println(de.getDname());
		}
	}

}
