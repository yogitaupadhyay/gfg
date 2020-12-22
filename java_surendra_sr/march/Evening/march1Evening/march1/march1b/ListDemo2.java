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

public class ListDemo2 {

	public static void main(String[] args) {
		 
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(new Integer(234));
		list.add(new Integer(67));
		list.add(new Integer(24));
		list.add(new Integer(87));
		list.add(new Integer(45));
		list.add(new Integer(66));
		
		System.out.println("before sort " + list);
		Collections.sort(list);
		System.out.println("after sort " + list);
		System.out.println(Collections.binarySearch(list, 1000));
		System.out.println(Collections.binarySearch(list, 24));
		System.out.println(Collections.binarySearch(list, 67));
		
	}

}
