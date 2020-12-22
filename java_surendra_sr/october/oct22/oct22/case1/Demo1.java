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
 */

  //Date  22/10/2018
 public class Demo1 {

	public static void main(String args[]){
	
			Tv t1  = new Tv();
				t1.brandName="sony";
				t1.price=565656;
				t1.color="black";
				t1.on();
				t1.display();
				t1.volumeUp();
				t1.volumeDown();
				t1.off();

System.out.println("+++++++++++++++++++++++++++");
        SmartTv stv = new SmartTv();
			stv.brandName="SAMSUNG";
			stv.price=1565656;
			stv.color="muli color";
			stv.on();
			stv.display();
			stv.volumeUp();
			stv.volumeDown();
			System.out.println("+++++++++++++++++");
			stv.connectHdmi();
			stv.playGame();
			System.out.println("+++++++++++++++++");
			
			
			stv.off();



	  
	  
	}//end main

}//end class