import java.util.Random;
import java.util.TreeSet;

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

public class Req4 {

 
	public static void main(String[] args) {
		 TreeSet<Integer> trainerNumbers  = new TreeSet <Integer>();
		 
		 Random rand = new Random();
		/* for(int req=1;req<=5;req++) {
			  int num  = rand.nextInt(10)+1;
			  System.out.println("gendernated num "+num);
			 trainerNumbers.add(num);
		 }*/
		 
		 do {
			 int num  = rand.nextInt(40)+1;
			  System.out.println("gendernated num "+num);
			 trainerNumbers.add(num);
		 }while(trainerNumbers.size()!=15);
		 
		 System.out.println("_____________________________");
		 System.out.println(trainerNumbers.size());
		 System.out.println(trainerNumbers);
		 

	}

}
