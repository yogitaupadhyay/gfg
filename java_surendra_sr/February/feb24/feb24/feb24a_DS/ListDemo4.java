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

public class ListDemo4 {

	 
	public static void main(String[] args) {
		
		ArrayList stuList1  = new ArrayList();
		System.out.println("____________________");
		stuList1.add(new String("gita"));
		stuList1.add(new String("rita"));
		stuList1.add(new String("ramesh"));
		stuList1.add(new String("deepak"));
		
		ArrayList stuList2  = new ArrayList();
		stuList2.add(new String("rita"));
		stuList2.add(new String("ganesh"));
		stuList2.add(new String("meena"));
		System.out.println("________________________");
		 System.out.println("stuList1 = "+stuList1);
		 System.out.println("stuList1 = "+stuList1.size());
		 System.out.println("stuList2 size  = "+stuList2);
		 System.out.println("stuList2size  = "+stuList2.size());
	
	stuList1.addAll(stuList2);//append at last 
		 System.out.println("stuList1 = "+stuList1);
		 System.out.println("stuList1 = "+stuList1.size());
		 System.out.println("stuList2 = "+stuList2);
		
		
		
		
		
		
		

	}

}
