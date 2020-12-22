
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

public class Singer extends Human {
	public Singer(String name) {
		   super(name);
		}
	
	public void sing() {
		System.out.println(name  + " is singing ");
	}
	public void speak() {
		System.out.println(name  + "  (singer) speaking");
	}
	
	static void whatIsIt() {
		System.out.println("+++++++++++about Singer+++++++++++");
		System.out.println("Can sing");
		System.out.println("can change humans mood ");
	}
	
}
