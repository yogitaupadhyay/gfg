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

public class WaterFillDemo1 {

	public static void main(String[] args) throws Exception {
		Bottle myBottle   = new Bottle(); 
		Human stu1  = new Human("Ramesh",myBottle);
		Human stu2  = new Human("Gita",myBottle);
		Human stu3  = new Human("Mahesh",myBottle);
		 
		Human [] myStudents = {stu1,stu2,stu3};
		Random rand  = new Random();
		
		while( myBottle.isFullWater()==false) {
			Thread.sleep(2000);
			int pickIndex = rand.nextInt(myStudents.length);//0-2
			Human performer = myStudents[pickIndex];
			performer.waterFill();
			System.out.println("#############################\n\n");
		}

	}

}
