
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

public class SisShapeUtil {

	public static Shape[] getAllShape() {
		Shape [] arr = new Shape[3];
		Circle s1  = new Circle();
		s1.setBackgroundColor("red");
		s1.setBorderColor("green");
		s1.setRadius(5);
		
		Cube s2  = new Cube();
		s2.setBackgroundColor("blue");
		s2.setBorderColor("white");
		s2.setSide(10);
		
		Cube s3  = new Cube();
		s3.setBackgroundColor("black");
		s3.setBorderColor("pink");
		s3.setSide(20);
		
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		
		
		return arr;
	}

}
