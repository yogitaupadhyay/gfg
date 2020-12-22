import java.io.DataOutputStream;
import java.io.FileNotFoundException;
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

public class XSaveDemo {
 
	public static void main(String[] args) throws Exception {
		
		X x1 = new X(10,20,30,40,50);
		X x2 = new X();
		x2.setI(111);
		x2.setJ(222);
		x2.setK(333);
		x2.setL(444);
		x2.setM(555);
		
		 x1.show(); 
		 x2.show(); 
		 
		ObjectOutputStream oos = null;
		 oos = new ObjectOutputStream(new FileOutputStream("data"));
		oos.writeObject(x1); 
		oos.writeObject(x2);
		oos.close();
		System.out.println("all object saved");
		 
		 

	}

}
