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

  //Date  13/12/2018
 public class Demo2 {

	public static void main(String args[]){
	
	 Human h1  = new Human();
	 
	 
	 System.out.println(h1);
	 
	// System.out.println( "name "+ h1.name);
	 System.out.println( "name "+ h1.getName());
	// System.out.println("age "+h1.age);
	 System.out.println("age "+h1.getAge());
	 //System.out.println("isFit "+h1.fit);
	 System.out.println("weight "+h1.getWeight());
	// System.out.println("weight "+h1.weight);
	 System.out.println("++++++++++++++++++++++++++");
	 
	/* h1.name="ravi";  //null "" 113  2   200  
	 h1.age=3222;
	 h1.fit=true;
	 h1.weight=-60;
	 */
	 
	 h1.setName(null);
	 h1.setName("");
	 h1.setName("     ");
	 h1.setName("ra");
	 h1.setName("raasjfdkljfaklsjfdklasjfkljsadfkjsafjsjsakldjsjdfjd");
	 h1.setName("Samay");
	 //h1.setName("a234");
	 
	 h1.setAge(0);
	 h1.setAge(1100);
	 h1.setAge(-11);
	 h1.setAge(22);
	 
	 System.out.println("++++++++++++++++++++++++++");
	 h1.giveDetailsAboutYou();
	 
	}//end main

}//end class