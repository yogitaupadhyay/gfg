
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

public class Rect extends Shape{
	 float height;
	 float width;
	 
	public Rect(String borderColor, String backgroundColor,float height, float width) {
		super(borderColor,backgroundColor);
		this.height = height;
		this.width = width;
	}

	public void draw() {
		 System.out.println(this  +" Rectangle  draw...with...");
		 System.out.println("border color  " +borderColor +" bg " +backgroundColor +" h " + height +" w " + width);
	 }

}
