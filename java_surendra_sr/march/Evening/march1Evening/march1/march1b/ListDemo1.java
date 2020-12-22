import java.util.ArrayList;
import java.util.Collections;

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

public class ListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list  = new ArrayList<String>();
		list.add(new String("javac"));
		list.add(new String("ada"));
		list.add(new String("basic"));
		list.add(new String("cobol"));
		list.add(new String("php"));
		list.add(new String("c"));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<Integer> list2  = new ArrayList<Integer>();
		list2.add(new Integer(234));
		list2.add(new Integer(67));
		list2.add(new Integer(24));
		list2.add(new Integer(87));
		list2.add(new Integer(45));
		list2.add(new Integer(66));
		
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println("after sort");
		System.out.println(list2);
		Collections.shuffle(list2);
		System.out.println("after shuffle");
		System.out.println(list2);
		Collections.shuffle(list2);
		System.out.println("after shuffle");
		System.out.println(list2);
		
		Collections.reverse(list2);
		System.out.println("after reverse");
		System.out.println(list2);
		
	}

}
