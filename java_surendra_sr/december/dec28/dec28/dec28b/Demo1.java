import java.util.Scanner;

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

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal myAnimal  = null;
		
		   myAnimal = new Dog();
		   
		   myAnimal.eat();
		   myAnimal.sleep();
		   myAnimal.makeVoice();
System.out.println("+++++++++++++++++");		   
		   
		   myAnimal = new Lion();
		   myAnimal.eat();
		   myAnimal.sleep();
		   myAnimal.makeVoice();

	}

}
