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

public class ListDemo1 {

	 
	public static void main(String[] args) {
		
		ArrayList stuList  = new ArrayList();
		System.out.println(stuList.toString());
		System.out.println(stuList.size());
		System.out.println(stuList.isEmpty());
		System.out.println("____________________");
		stuList.add(new String("gita"));
		stuList.add(new String("rita"));
		stuList.add(new String("ramesh"));
		stuList.add(new String("rita"));
		stuList.add(new String("ganesh"));
		stuList.add(new String("meena"));
		stuList.add(new String("meena"));
		stuList.add(new String("meena"));
		stuList.add(new String("deepak"));
		System.out.println(stuList.size());
		System.out.println(stuList.isEmpty());
		System.out.println(stuList.toString());
		
		for(int stu=1;stu<=stuList.size();stu++) {
			Object obj = stuList.get(stu-1);
			//System.out.println("stu# "+stu + obj);
			//System.out.println("stu# "+stu+"  " + obj.toString());
			//System.out.println("stu# "+stu+"  " + obj.toUpperCase());
			String name  = (String)obj;
			System.out.print("stu# "+stu +" \t");
			System.out.println( name.toUpperCase()  +"  " + name.length());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
