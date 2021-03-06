import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		List<Integer> list  = new ArrayList<Integer>();
		list.add(new Integer(55));
		list.add(new Integer(33));
		list.add(new Integer(88));
		list.add(new Integer(22));
		list.add(new Integer(77));
		 
		//way1
		for(int e=1;e<=list.size();e++) {
			Integer obj  = list.get(e-1);
			System.out.print(obj+" ");
		}
		System.out.println();
		
		//way2
		for(Integer obj : list) {
			System.out.print(obj+" ");
		}
		System.out.println();
				
		
		
		
		

	}

}
