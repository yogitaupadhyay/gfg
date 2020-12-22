
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
 
   CurrentYear 2018 
 */

public class Demo2 {

	 
	public static void main(String[] args) {
		 
	 Human  myfriend1  = new Human("Ramesh"); 	
	 Singer myfriend2  = new Singer("Ganesh");
	 
	 
	 Human host1 = myfriend1;
	 Human host2 = myfriend2;
	 System.out.println("host1 " + myfriend1  +" "+host1);
	 host1.eat();
	 host1.sleep();
	 host1.speak();
	 
	 System.out.println("++++++++++++++++++++++++");
	 System.out.println("host2 " + myfriend2  +" "+host2);
	 host2.eat();
	 host2.sleep();
	 host2.speak();
	 
	 
	 
	 
	 

	}

}
