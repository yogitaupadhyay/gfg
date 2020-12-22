
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

public class BallDemo1 {

	 
	public static void main(String[] args) {
	 
		SpecialBall ball = new SpecialBall();
		
		ball.brandName="sis";
		ball.color="white";
		ball.madeOf="rubber";
		ball.weight=150.0f;
		ball.price=100;
		//throw it
		ball.roll();
		//drop it
		System.out.println("++++++++++++++++++++");
		ball.bounce();
		System.out.println("++++++++++++++++++++");
		ball.pressButton();
		ball.pressButton();
		ball.pressButton();
		
		
		
		
		
		
		
		

	}

}
