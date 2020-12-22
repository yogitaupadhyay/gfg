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
 
   CurrentYear 2019 
 */

public class AutoGenValues {
	public static void main(String[] args) {

		Random rand  =new Random();
		
		
		//100  10000
		for(int train=1;train<=10;train++) {
			int id =rand.nextInt(1000000);
			float price  = rand.nextInt(201)+100;
			String name ="name"+1;
			boolean available  = rand.nextBoolean();
			
			//System.out.println(id +" "+name+"" +price +""+available);
			System.out.printf("%10d",id);
			System.out.printf("%20s",name);
			System.out.printf("%10.2f",price);
			System.out.printf("%15s",available);
			System.out.println();
			
			
			
			
			
		}
		
		
		
		
		
		
	}
}
