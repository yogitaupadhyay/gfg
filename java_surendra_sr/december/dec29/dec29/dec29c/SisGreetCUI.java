import java.util.Date;

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

public    class SisGreetCUI  extends SisGreet {
	
	public  void showGreeting(){
	    String msg  = "Today is " + new Date()+"\n";
		msg  = msg  + "Welcome user " + getUserName();
	    
		System.out.println("++++++++++++++++++++++++++");
			System.out.println(msg);
		System.out.println("++++++++++++++++++++++++++");
	}

}
