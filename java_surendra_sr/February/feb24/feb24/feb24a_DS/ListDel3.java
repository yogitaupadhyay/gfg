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

public class ListDel3 {

	 
	public static void main(String[] args) {
		
		ArrayList stuList1  = new ArrayList();
		System.out.println("____________________");
		stuList1.add(new String("gita"));
		stuList1.add(new String("gita"));
		stuList1.add(new String("mukesh"));
		stuList1.add(new String("mukesh"));
		stuList1.add(new String("deepak"));
		stuList1.add(new String("rita"));
		stuList1.add(new String("ganesh"));
		stuList1.add(new String("meena"));
	 


		ArrayList removeList  = new ArrayList();
	 
		removeList.add(new String("mukesh"));
		removeList.add(new String("deepak"));
		removeList.add(new String("gita"));
		 System.out.println("stuList1 = "+stuList1);
		 System.out.println("removeList = "+removeList);
		 
		 boolean isRemoveAll  = stuList1.removeAll(removeList);
		 System.out.println(isRemoveAll);
		 
		 
  System.out.println("stuList1 = "+stuList1);
		 

	}

}
