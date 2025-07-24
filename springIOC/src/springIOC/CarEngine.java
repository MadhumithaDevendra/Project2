package springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngine {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringIOC.xml");
		 Car c= (Car)context.getBean("car1");
		 System.out.println("Brand name:"+c.getBrand());
		 System.out.println("cost:"+c.getCost());
		 System.out.println("car id number:"+c.getIdno());
		 System.out.println("engine make:"+c.getEng().getMake());
		 System.out.println("engine capacity:"+c.getEng().getCapacity());

	}

}
