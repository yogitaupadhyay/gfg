import java.util.Stack;

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

public class PizzaDemo {

	public static void main(String[] args) {
		Pizza p0  = new Pizza(300, "small", "LMN");
		 Pizza p1  = new Pizza(300, "small", "xyz");
		 Pizza p2  = new Pizza(400, "large", "ABC");
		 Pizza p3  = new Pizza(500, "extra large", "LMN");

	     //Stack<Pizza> box = new Stack<>(); //1.8
		 Stack<Pizza> box = new Stack<Pizza>();
		 box.push(p3);
		 box.push(p2);
		 box.push(p1);
		 box.push(p0);
		 for(int p=box.size();p>=1;p--) {
			Pizza myPizza =   box.get(p-1);
			System.out.println(myPizza);
		 }
		 
		 
		 Pizza searchPizza  = new Pizza(300, "small", "xyz");
		 System.out.println(box.search(searchPizza));
		 
	}

}
