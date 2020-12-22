
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

public class Bottle {
	private float totalWater;
	final static private float MAX_WATER = 100;

	public void showDetails() {
		System.out.println("******************" + this + "*****************");
		System.out.println("available Water : = " + totalWater);
		System.out.println("***********************************");
	}

   public void fill(float inputWater) {
	   
	   if(totalWater==MAX_WATER) {
		   System.out.println(this  +" alread full");
		   return;
	   }
	   float temp  = totalWater + inputWater;
	   if(temp>MAX_WATER) {
		   System.out.println("water bottle will be overflow with "+ inputWater +" water" );
		  return;
	   }
	   
	   System.out.println("before fill  totalWater " +  totalWater );
	    totalWater  = totalWater + inputWater;
	   System.out.println("after fill "+inputWater+" water   totalWater " +  totalWater );
	   
	   showDetails();
   }

public boolean isFullWater() {
	return totalWater==MAX_WATER;
}		
	
}
