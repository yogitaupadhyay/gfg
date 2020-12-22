import java.io.FileWriter;
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

public class temp {
	public static void main(String[] args) throws Exception{

		Random rand  =new Random();
		String allData ="";
		
		
		//100  10000
		for(int train=1;train<=10;train++) {
			int id =rand.nextInt(1000000);
			float price  = rand.nextInt(201)+100;
			String name ="name"+1;
			boolean available  = rand.nextBoolean();
			
			String idStr = String.format("%10d",id);
			String nameStr = String.format("%20s",name);
			String priceStr = String.format("%10.2f",price);
			String availableStr = String.format("%15s",available);
			
			allData = allData + idStr;
			allData = allData + nameStr;
			allData = allData + priceStr;
			allData = allData + availableStr;
			allData = allData + "\n";
			
			
		}System.out.println(allData);
		
		FileWriter fw  = new FileWriter("file1");
		fw.write(allData);
		fw.close();
		System.out.println("data saved file1" );
		
		
		
	}
}
