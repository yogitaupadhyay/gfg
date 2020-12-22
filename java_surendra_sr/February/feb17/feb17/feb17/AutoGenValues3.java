import java.io.FileWriter;
import java.io.PrintWriter;
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
public class AutoGenValues3 {
	public static void main(String[] args) throws Exception{

		Random rand = new Random();
		PrintWriter out  = new PrintWriter("file2");
		
		for(int train=1;train<=10;train++) {
			int id =rand.nextInt(1000000);
			float price  = rand.nextInt(201)+100;
			String name ="name"+1;
			boolean available  = rand.nextBoolean();
			out.format("%10d",id);
			out.format("%20s",name);
			out.format("%10.2f",price);
			out.format("%15s",available);
			out.println();
		}
		//System.out.println(allData);
		out.close();
		System.out.println("data saved file2");
		
		
		
	}
}
