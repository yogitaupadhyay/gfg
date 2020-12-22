
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

public class SpeBall {
	private String color;
	private int price;
	private int weigth;

	public SpeBall(String color, int price, int weigth) {
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
		  if(obj instanceof SpeBall) {
			  SpeBall otherBall = (SpeBall)obj;
			  boolean c1  = this.price==otherBall.price;
			  boolean c2  = this.color.equals(otherBall.color);
			  if(c1==true && c2==true) {
				  return true;
			  }
			  
		  }
		  
		return false;
	}
	
	public int hashCode() {
		int logic1 = price;
		int logic2 = 0;
		/*for(int c=1;c<=color.length();c++) {
			char  ch = color.charAt(c-1);
			logic2 +=ch;
		}*/
		logic2 = color.hashCode();
		
		int myLogic = logic1*logic2;
		return myLogic;
	}
	
	

}
