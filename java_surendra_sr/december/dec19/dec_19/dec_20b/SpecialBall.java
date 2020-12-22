
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

public class SpecialBall extends Ball{
	  LedBulb bulb1  = new LedBulb("red");
	  LedBulb bulb2  = new LedBulb("green");

	  boolean isBulbOn;//false
	  
	  int totalButtonPress;//0
	  
	  void pressButton() {
		  
		  totalButtonPress++;
		  
		  System.out.println("button pressed  " + totalButtonPress);
		  if(isBulbOn) {
			  stopLight();
			  isBulbOn= false;
		  }else {
			  startLight();
			  isBulbOn= true;
		  }
		  
	  }
	  
	  void startLight() {
		  bulb1.on();
		  bulb2.on();
		  System.out.println("both bulb lighting...");
	  }
	  
	  void stopLight() {
		  bulb1.off();
		  bulb2.off();
		  System.out.println("both bulb off...");
	  }
	  
	  
}
