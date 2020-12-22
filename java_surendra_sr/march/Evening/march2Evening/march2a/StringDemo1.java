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

public class StringDemo1 {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add(new String("java"));
		list.add(new String("cpp"));
		list.add(new String("php"));
		list.add(new String("css"));
		System.out.println(list);
		Collections.sort(list);//Asc
		System.out.println(list);
		Collections.sort(list,new StringSortByDesc());//Desc
		System.out.println(list);
		
		
		
				
		
		
		
		
		

	}

}
