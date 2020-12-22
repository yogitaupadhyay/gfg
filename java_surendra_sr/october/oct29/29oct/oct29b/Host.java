
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

public class Host extends Human{

	public void identify(Human selectPerson) {
		
		if(selectPerson instanceof Human) {
			System.out.println(selectPerson +" is Human");
		}
		
		if(selectPerson instanceof Dancer) {
			System.out.println(selectPerson +" is Dancer & can dance ");
		}
		if(selectPerson instanceof Player) {
			System.out.println(selectPerson +" is Player & can play ");
		}
		
		if(selectPerson instanceof Writer) {
			System.out.println(selectPerson +" is Writer & can write Story ");
		}
		
		if(selectPerson instanceof Singer) {
			System.out.println(selectPerson +" is Singer & can sing ");
			//selectPerson.sing();//CTE
			//Singer singer  = selectPerson;
			System.out.println("$$$$$$$$$$$$$$$$");
			Singer singer  = (Singer)selectPerson;
			singer.sing();
			System.out.println("$$$$$$$$$$$$$$$$");
			
			
		}
		if(selectPerson instanceof Painter) {
			System.out.println(selectPerson +" is Painter & can paint ");
		}
		
		if(selectPerson instanceof Student) {
			System.out.println(selectPerson +" is Student & can read &write ");
		}
		
		if(selectPerson instanceof Trainer) {
			System.out.println(selectPerson +" is Trainer & can teach ");
		}
		
		if(selectPerson instanceof Doctor) {
			System.out.println(selectPerson +" is Doctor & can operation ");
		}
		
		
		
		
		
		
		
	}
	
	

}
