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

  //Date  02/10/2018
 public class Demo2 {

	public static void main(String args[]){
	  
	 Box box1  = new Box();
	 System.out.println("main"+box1);
	 box1.a=99;
	 // int a=99;
	  System.out.println("in main " + box1.a);
	  SisUtil util  = new SisUtil();
	  
	  util.updateValue(box1);
	  //util.updateValue(box1);
	  //util.updateValue(box1);
	  System.out.println("after update in main " + box1.a);
	  
	}//end main

}//end class