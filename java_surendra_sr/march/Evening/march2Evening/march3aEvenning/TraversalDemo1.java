import java.util.ArrayList;
import java.util.Iterator;

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

public class TraversalDemo1 {
 
	public static void main(String[] args) {
		 
	 ArrayList<String>list=new ArrayList<String>();
	 list.add("Apple");
	 list.add("Bat");
	 list.add("Cat");
	 list.add("Dog");
	 //System.out.println(list.toString());
	 for (int e = 1; e <= list.size(); e++) {
		System.out.println(list.get(e-1));
	}
	 System.out.println("_________________________");
	 for (String str : list) {
		System.out.println(str);
	 }
	 
	 System.out.println("_________________________");
	 Iterator<String> it = list.iterator();
	 while(it.hasNext()) {
		 String str = it.next();
		 System.out.println(str);
	 }
	 
		

	}

}
