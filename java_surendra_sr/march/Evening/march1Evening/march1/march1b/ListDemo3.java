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

public class ListDemo3 {

	public static void main(String[] args) {
		 
		
		ArrayList<SisInteger> list  = new ArrayList<SisInteger>();
		list.add(new SisInteger(234));
		list.add(new SisInteger(67));
		list.add(new SisInteger(24));
		list.add(new SisInteger(87));
		list.add(new SisInteger(45));
		list.add(new SisInteger(66));
		
		System.out.println("before sort " + list);
		Collections.sort(list);
		System.out.println("after sort " + list);
	}

}
