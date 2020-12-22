
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

public class ShapeDemo {

	public static void main(String[] args) throws Exception{
		
		Shape []shapeList = {
				new Circle("red", "green", 5.4f),
				new Rect("blue", "black", 100f,200f),
		};
		
		for (Shape selectShape : shapeList) {
			Thread.sleep(2000);
			System.out.println(selectShape);
			selectShape.draw();
			
		}
		
		
		
		
		
		
	}

}
