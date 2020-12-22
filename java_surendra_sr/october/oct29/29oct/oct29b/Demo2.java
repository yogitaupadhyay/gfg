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

public class Demo2 {
public static void main(String[] args)throws Exception {
	
	Human h1  = new Painter();
	Human h2  = new Singer();
	Human h3  = new Doctor();
	Human h4  = new Writer();
	Human h5  = new Player();
	Human h6  = new Dancer();
	Human h7  = new  Human();
	Human h8  = new Student();
	Human h9  = new Trainer();
	Human [] humanList  = {h8,h9,h1,h2,h3,h7,h4,h5,h6};
	//System.out.println("total humans  " + humanList.length);
	
	Host host  = new Host();
	for(Human selectPerson : humanList) {
		Thread.sleep(3000);
		host.identify(selectPerson);
		System.out.println("*************************************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
