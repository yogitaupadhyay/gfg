
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

public abstract class Bike {
	public void start() {
		System.out.println(this +" starting...");
	}
	public void stop() {
		System.out.println(this +" stoped...");
	}
	public void run() {
		System.out.println(this +" running...");
	}
	
	public void fillFuel(float ltr) {
		System.out.println(this +" fillFuel with "+ltr+"ltr...");
	}
	
	public abstract void brake();
	
}
