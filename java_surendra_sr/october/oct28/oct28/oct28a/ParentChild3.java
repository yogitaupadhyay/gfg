
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

public class ParentChild3 {

 
	public static void main(String[] args) {
		 Parent p1  = new Parent();
		 Child c1  =new Child();
		 
		 
		 Parent pref  = null;
		 
		 System.out.println("pref " + pref);
		 System.out.println("++++++++++++++++++++");
		 
		 pref  = p1;
		 System.out.println("pref=  " + pref);
		 pref.eat();
		 pref.sleep();
		 pref.walk();
		 pref.speak();
		 System.out.println("++++++++++++++++++++");
		 
		 pref  = c1;
		 System.out.println("pref = " + pref);
		 pref.eat();//P
		 pref.sleep();//P
		 pref.walk();//P
		 pref.speak();//??? c
		 
		 pref.devJavaSw();//CTE
		 pref.playComputerGame();//CTE
		 
		 
		 
	}

}
