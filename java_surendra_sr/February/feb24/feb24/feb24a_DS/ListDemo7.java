import java.util.ArrayList;

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

public class ListDemo7 {

	 
	public static void main(String[] args) {
		
		ArrayList stuList1  = new ArrayList();
		System.out.println("____________________");
		stuList1.add(new String("gita"));
		stuList1.add(new String("mukesh"));
		stuList1.add(new String("ramesh"));
		stuList1.add(new String("deepak"));
		stuList1.add(new String("rita"));
		stuList1.add(new String("ganesh"));
		stuList1.add(new String("mukesh"));
		stuList1.add(new String("meena"));
	 
		 System.out.println("stuList1 = "+stuList1);
	 
		 System.out.println(stuList1.contains("surendra"));//false
		 System.out.println(stuList1.contains("gita"));//true
		  
		System.out.println("____________________");
		 
		 ArrayList searchList  = new ArrayList();
		searchList.add(new String("gita"));
		searchList.add(new String("meena"));
		searchList.add(new String("ramesh"));
		 
		 System.out.println("list "+ stuList1);
		 System.out.println("search list "+ searchList);
		 
		 System.out.println(stuList1.containsAll(searchList));//true


System.out.println("___________________________________");		 
		 ArrayList searchList2  = new ArrayList();
		searchList2.add(new String("gita"));
		searchList2.add(new String("surendra"));
		searchList2.add(new String("ramesh"));
		 System.out.println("list "+ stuList1);
		 System.out.println("search list2 "+ searchList2);
		 System.out.println(stuList1.containsAll(searchList2));//true
		
		

	}

}
