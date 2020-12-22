
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
		Human h1 = new Human("ramesh"); 
		Human h2 = new Human("ganesh"); 
		Human h3 = new Human("mukesh"); 
		
		h1.aboutMe();
		h2.aboutMe();
		h3.aboutMe();
		h1.friend = h2;
		h1.aboutMe();
		h2.friend = h3;
		h2.aboutMe();
		h3.aboutMe();
		//h3.friend=h1;
		//h3.aboutMe();
		
	   System.out.println("++++++++++++++++++++++++++");
		Human currentPerson = h1;
		 System.out.println(currentPerson.name);
		 currentPerson = h1.friend;
		 System.out.println(currentPerson.name);
		 currentPerson = currentPerson.friend;
		 System.out.println(currentPerson.name);
		
		
		
		
		
		
		
	}

}
