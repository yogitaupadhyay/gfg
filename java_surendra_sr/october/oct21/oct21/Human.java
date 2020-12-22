import java.util.Random;

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

public class Human {
	private String name;
    Bottle bottle  ; 
	public Human(String name,Bottle bottle) {
		this.name = name;
		this.bottle =bottle;
		//System.out.println( this +  " name is "+name  +" and it has " + bottle);
	}
	public void waterFill() {
			//5 20
		Random rand  = new Random();
		int waterLtr  = rand.nextInt(20)+1;
		System.out.println(name +" is going to fill water " +waterLtr +" ltr");
		bottle.fill(waterLtr);
		System.out.println(name  +" done task ");
		
		
	}
	
	
	
}
