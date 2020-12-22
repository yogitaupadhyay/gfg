import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class SaveObject {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		Human h1  = new Human();
		Human h2  = new Human();
		Human h3  = new Human();
		h1.setName("ravi");
		h1.setAge(22);
		h1.setWeight(66.7f);
		
		h2.setName("gita");
		h2.setAge(21);
		h2.setWeight(56.7f);
		
		h3.setName("ramesh");
		h3.setAge(21);
		h3.setWeight(76.7f);
		
		
		System.out.println(h1.getAllDetails());
		System.out.println(h2.getAllDetails());
		System.out.println(h3.getAllDetails());
		
		
	ObjectOutputStream oos  = null;
	oos  = new ObjectOutputStream(new FileOutputStream("human_list"));
	oos.writeObject(h1);
	oos.writeObject(h2);
	oos.writeObject(h3);
	oos.close();
	System.out.println("all human object saved");
	
	
	
	
	
		
		
		
		
		
		
	}

}
