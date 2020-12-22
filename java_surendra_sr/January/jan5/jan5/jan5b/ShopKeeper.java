
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

public class ShopKeeper {
    
	Toy toyList[]= {
		 new Car(),
		 new Mobile(),
		 new  RemotePlane(),
		 new BatAndBall(),
		 new TeddyBear(),
		 new BowAndErrow(),
		 new Gun(),
		 new Sward(),
		 new Train(),
	};
	
	public int howManyToys() {
		return toyList.length;
	}
	
	public Toy[] getToyList() {
		return toyList;
	}
	
	
	void showDetails(Toy selectToy) {
		System.out.println("___________"+selectToy+"___toy Details ______________");
		if(selectToy instanceof Danger) {
			System.out.println("this toy is not good for child");
		}
		if(selectToy instanceof Washable) {
			System.out.println("You can wash it");
		}
	}
	
	
	
	
	
	
}
