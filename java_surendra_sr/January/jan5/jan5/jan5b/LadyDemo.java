
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

public class LadyDemo {

	 
	public static void main(String[] args) throws Exception {
		 
		ShopKeeper salesMan  = new ShopKeeper();
		System.out.println("how many toy " +salesMan.howManyToys());
		
		Toy[] toyList = salesMan.getToyList();
		
	for (int toyNumber = 1; toyNumber <=toyList.length; toyNumber++) {
		System.out.println("toyNumber#"+toyNumber);
		System.out.println("sales man thinking");
		Thread.sleep(2000);			
	    Toy yeToy = toyList[toyNumber-1];
	    salesMan.showDetails(yeToy);
	}
		
		

	}

}
