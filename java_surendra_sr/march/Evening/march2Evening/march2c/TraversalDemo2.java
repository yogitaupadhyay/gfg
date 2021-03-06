import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

public class TraversalDemo2 {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(new Integer(55));
		list.add(new Integer(33));
		list.add(new Integer(88));
		 System.out.println(list);
		 //>>[55, 33, 88]
		 Iterator<Integer> itObj = list.iterator();
		 System.out.println(itObj.hasNext());//true
		 System.out.println(itObj.next());//55
		  //[55,>> 33, 88]
		 System.out.println(itObj.hasNext());//true
		 System.out.println(itObj.next());//33
		 
		 //[55, 33>>, 88]
		 System.out.println(itObj.hasNext());//true
		 System.out.println(itObj.next());//88
		 //[55, 33, 88>>]
		 System.out.println(itObj.hasNext());//false
		 System.out.println(itObj.next());//??
		//java.util.NoSuchElementException
		

	}

}
