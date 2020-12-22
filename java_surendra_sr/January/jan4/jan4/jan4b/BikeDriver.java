
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

public class BikeDriver {

	public void identifyBikeAndAction(Bike bike) {
		System.out.println("given byke ref "+ bike);
		bike.fillFuel(1);
		bike.start();
		bike.run();
		bike.brake();
		bike.stop();
		
		if(bike instanceof Flyable) {
			System.out.println("Ye to udne wala bike hai");
			//CTE bike.fly();
			Flyable flyableBike  = (Flyable)bike;
			flyableBike.fly();
			
		}
		if(bike instanceof Swimmable) {
			System.out.println("AArey ye  to swim bhi kar sakta hai");
			Swimmable swimBike  = (Swimmable) bike;
			swimBike.swim();
		}
		
		
		
		
	} 

}
