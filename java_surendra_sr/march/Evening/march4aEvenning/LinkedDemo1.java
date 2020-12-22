import java.util.LinkedList;

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

public class LinkedDemo1 {

 
	public static void main(String[] args) {
		LinkedList<Integer>list  = new LinkedList<Integer>(); 
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.addFirst(1000);
		System.out.println(list);
		list.addLast(9999);
		System.out.println(list);
		list.add(2,-8887);
		System.out.println(list);
		//[1000, 10, -8887, 20, 30, 9999]
		
		

	}

}
