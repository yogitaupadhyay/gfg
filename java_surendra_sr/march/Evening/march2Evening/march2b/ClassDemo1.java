import java.util.ArrayList;
import java.util.Date;

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

public class ClassDemo1 {
 
	public static void main(String[] args) {
		 
		ArrayList list  = new ArrayList();
		list.add("hello");
		list.add(10L);
		list.add(50.5f);
		list.add(true);
		list.add(new Date());
		for(Object obj : list) {
		  System.out.println(obj);
		  System.out.println(obj.getClass());
		  System.out.println(obj.getClass().getName());
		  System.out.println("________________");
		}
		
		
		
		

	}

}
