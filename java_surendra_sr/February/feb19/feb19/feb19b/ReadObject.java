import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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

public class ReadObject {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {

		
		ObjectInputStream ois  = null;
		ois  = new ObjectInputStream(new  FileInputStream("human_list"));
		
		Object ob1 = ois.readObject();
		
		System.out.println(ob1.toString());
		//getAllDetails
		if(ob1 instanceof Human) {
			Human h1  = (Human) ob1;
			System.out.println(h1.getName());
			System.out.println(h1.getAllDetails());
			
		}
		
		ois.close();
	
		
		
		
		
		
		
	}

}