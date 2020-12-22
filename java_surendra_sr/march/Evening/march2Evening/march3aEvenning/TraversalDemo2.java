import java.util.ArrayList;
import java.util.Iterator;
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

public class TraversalDemo2 {
 
	public static void main(String[] args) {
		 
	 ArrayList<String>list=new ArrayList<String>();
	 list.add("A");
	 list.add("B");
	 list.add("C");
	 list.add("D");
	 System.out.println(list);
	 //>>[A, B, C, D]
	 ListIterator<String> lit = list.listIterator();
	 System.out.println(lit.hasNext());//true
	 System.out.println(lit.hasPrevious());//false
	 System.out.println(lit.next());//A
	//[A >> B, C, D]
	 System.out.println(lit.hasNext());//true
	 System.out.println(lit.hasPrevious());//true
	 System.out.println(lit.nextIndex());//1
	 System.out.println(lit.previousIndex());//0

	 System.out.println(lit.next());//B
	//[A  B>> C, D]
	 
	 System.out.println(lit.hasNext());//true
	 System.out.println(lit.hasPrevious());//true
	 System.out.println(lit.nextIndex());//2
	 System.out.println(lit.previousIndex());//1
	 
	}

}
