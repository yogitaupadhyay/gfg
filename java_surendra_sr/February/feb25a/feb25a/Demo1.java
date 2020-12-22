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

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> stuList  = new ArrayList<String>();

		stuList.add("aman");	
		stuList.add("beena");	
		stuList.add("beena");	
		stuList.add("surbhi");	
		stuList.add("beena");	
		stuList.add("beena");	
		stuList.add("rita");	
		stuList.add("deepak");	
		stuList.add("rita");	
		stuList.add("beena");	
		stuList.add("surbhi");	
		stuList.add("beena");	
		System.out.println("total student " +stuList.size());
		
	/*	for (int stu = 1; stu <= stuList.size(); stu++) {
			String name = stuList.get(stu-1);
			System.out.println("sno"+stu  +" = " +name);
		}*/
		
		for(String name : stuList) {
			System.out.println(name);
			
		}
		
		
		
		
		

	}

}
