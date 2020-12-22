
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

public class Demo4 {

	 
	public static void main(String[] args) {
		 
	 Human  myfriend1  = new Human("Ramesh"); 	
	 Singer myfriend2  = new Singer("Ganesh");
	 
	 
	 Human host = myfriend1;
	 
	 System.out.println("host " +host);
	 // Human cannot be converted to Singer
	//CTE  Singer mySinger  = host;
	// Singer mySinger  = (Singer)host;
	 //ClassCast AT RUN TIME 
	 
	 if(host instanceof Singer) {
		 Singer mySinger  = (Singer)host;
		 mySinger.sing();
		 
	 }else {
		 System.out.println("its not singer sorry go...");
	 }
	 System.out.println("++++++++++++++++++++++++++++++");
	 
	   host = myfriend2;
	   System.out.println("host " +host);
	   
		 if(host instanceof Singer) {
			 Singer mySinger  = (Singer)host;
			 mySinger.sing();
		 }else {
			 System.out.println("its not singer sorry go...");
		 }
	 
	 
	 
	 

	}

}
