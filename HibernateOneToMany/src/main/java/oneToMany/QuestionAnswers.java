package oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnswers {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
				
//		Question q1 = new Question();
//		q1.setQid(101);
//		q1.setQues("what is java?");
//		
//		Question q2 = new Question();
//		q2.setQid(102);
//		q2.setQues("what is hibernate?");
//		
//		Answers a1 = new Answers();
//		a1.setAid(201);
//		a1.setAnswer("html is front end language");
//		
//		Answers a2 = new Answers();
//		a2.setAid(202);
//		a2.setAnswer("java is a oops language");
//		
//		Answers a3 = new Answers();
//		a3.setAid(203);
//		a3.setAnswer("hibernate is a open source");
//		
//		Answers a4 = new Answers();
//		a4.setAid(204);
//		a4.setAnswer("java is a independent platform");
//		
//		Answers a5 = new Answers();
//		a5.setAid(205);
//		a5.setAnswer("hibernate is a orm tool");
//		
//		List<Answers> al1 = new ArrayList<Answers>();
//		al1.add(a2);
//		al1.add(a4);
//		
//		List<Answers> al2 = new ArrayList<Answers>();
//		al2.add(a3);
//		al2.add(a5);
//		
//		q1.setAns(al1);
//		q2.setAns(al2);
//		
//		a2.setQues(q1);
//		a4.setQues(q1);
//		a3.setQues(q2);
//		a5.setQues(q2);
//		
//		session.save(q1);
//		session.save(q2);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(a4);
//		session.save(a5);
//		
//		
//		transaction.commit();
//		
//		factory.close();
//		session.close();
		
		Question q=(Question)session.get(Question.class, 101);
		System.out.println(q.getQues());
		for(Answers an: q.getAns()) {
			System.out.println(an.getAnswer());
		}
		System.out.println("*****************");
		Answers a=(Answers)session.get(Answers.class, 205);
		System.out.println(a.getQues().getQues());
		System.out.println(a.getAnswer());
		
	}

}
