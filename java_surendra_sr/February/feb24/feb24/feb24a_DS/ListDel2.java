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

public class ListDel2 {

	 
	public static void main(String[] args) {
		
		ArrayList stuList1  = new ArrayList();
		System.out.println("____________________");
		stuList1.add(new String("gita"));
		stuList1.add(new String("mukesh"));
		stuList1.add(new String("deepak"));
		stuList1.add(new String("rita"));
		stuList1.add(new String("ganesh"));
		stuList1.add(new String("meena"));
	 
		 System.out.println("stuList1 = "+stuList1);
		 
		 System.out.println(stuList1.remove(0));//1st pos remove and return object
		 System.out.println("stuList1 = "+stuList1);
		 /*
		 stuList1 = [gita, mukesh, deepak, rita, ganesh, meena]
			gita
		stuList1 = [mukesh, deepak, rita, ganesh, meena]
		 
		 */
	 

	}

}
