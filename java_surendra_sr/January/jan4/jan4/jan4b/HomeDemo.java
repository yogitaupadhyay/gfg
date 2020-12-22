
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

public class HomeDemo {

	 
	public static void main(String[] args) throws Exception {
		 
		Bike[]myBikes= {
				new BikeType2(),
				new BikeType1(),
				new FBikeType(),
				new SBikeType(),
				new SisBike(),
		};
		
		BikeDriver friend  = new BikeDriver();
		for(int b=1;b<=myBikes.length;b++) {
			Thread.sleep(3000);
			Bike bike = myBikes[b-1];
			friend.identifyBikeAndAction(bike);
			System.out.println("______________________________");
		}
		
		

	}

}
