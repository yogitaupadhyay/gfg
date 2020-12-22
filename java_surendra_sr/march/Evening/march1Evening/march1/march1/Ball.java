
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

public class Ball {
	private String color;
	private int price;
	private int weigth;

	public Ball(String color, int price, int weigth) {
		super();
		this.color = color;
		this.price = price;
		this.weigth = weigth;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + ", weigth=" + weigth + "]";
	}
	@Override
	public boolean equals(Object obj) {
		  if(obj==null) return false;
		  if(this==obj) return true;
		  if(obj instanceof Ball) {
			  Ball otherBall = (Ball)obj;
			  if(this.price==otherBall.price) {
				  return true;
			  }
			  
		  }
		  
		return false;
	}
	
	public int hashCode() {
		int logic  = 100*price;
		return logic;
	}
	
	

}
