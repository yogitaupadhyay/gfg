
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

public class Demo5Static {

	 
	public static void main(String[] args) {
		 
	 Human  myfriend1  = new Human("Ramesh"); 	
	 Singer myfriend2  = new Singer("Ganesh");
	 
	 
	 Human host = myfriend1;
	 System.out.println("host " + host);
	 host.eat();
	 host.speak();
	 host.whatIsIt();
	 System.out.println("************************");
	 
	 host = myfriend2;
	 System.out.println("host " + host);
	 host.eat();
	 host.speak();
	 host.whatIsIt();
	 
	 
	 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	 
	 Singer host2 = myfriend2;
	 System.out.println("host2 " + host2);
	 host2.eat();
	 host2.speak();
	 host2.whatIsIt();
	 
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
	 Human.whatIsIt();
	 Singer.whatIsIt();

	}

}
