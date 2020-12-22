wimport java.util.ArrayList;
import java.util.ListIterator;

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

public class TraversalDemo3 {
 
	public static void main(String[] args) {
		 
	 ArrayList<String>list=new ArrayList<String>();
	 list.add("A");
	 list.add("B");
	 list.add("C");
	 list.add("D");
	 System.out.println(list);
	  
	 ListIterator<String> lit = list.listIterator();
	   while(lit.hasNext()) {
		   System.out.println(lit.next());
	   }
	   System.out.println("++++++++++++++++");
	   while(lit.hasPrevious()) {
		   System.out.println(lit.previous());
	   }
	   
	   
	 
	}

}
