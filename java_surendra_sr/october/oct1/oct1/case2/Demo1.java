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

  //Date  01/10/2018
 public class Demo1 {

	public static void main(String args[]){
	
	  Student myStudent  = new Student();
	  myStudent.name="vaibhav";
	  
	  int  []numberList =   myStudent.givesSomeNumbers(10);
	  
	  System.out.println(myStudent.name +" given total number " + numberList.length  +" are following");
	  
	  for(int temp: numberList){
	    System.out.println(temp);
	  }
	  
	  
	  System.out.println("+++++++++++++++++++++++++++++++");
	  String []myWords  ={"job","success","career","money","happy"};
	  
	  String studentFavoriteWord =   myStudent.chooseWord(myWords);
	  System.out.println(myStudent.name  +" word is " + studentFavoriteWord);
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class