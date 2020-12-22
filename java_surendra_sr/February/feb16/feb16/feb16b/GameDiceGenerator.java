import java.io.FileWriter;
import java.io.IOException;
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

public class GameDiceGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		StringBuffer allData= new StringBuffer();
		for(int user=1;user<=10;user++) {
			String id  = "sis_"+user;
			allData.append(id+"::");
			int sum =0;
			 for(int dno=1;dno<=5;dno++) {
				 int dice = rand.nextInt(6)+1;
				 allData.append(dice+"::");
				 sum +=dice;
			 }
			 allData.append(sum+"\n");
		}
		
		System.out.println(allData);
		
		FileWriter fw  = null;
		//String fileName ="user_dice.data";
		String fileName =System.currentTimeMillis()+"_user_dice.data";
		
		try {
			fw  = new FileWriter(fileName);
			fw.write(allData.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				try {
					fw.close();
					System.out.println("Records saved " + fileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//if
		}//finally
		
	}//main

}//class
