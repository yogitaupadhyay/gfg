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

  //Date  12/09/2018
 public class Demo3b{

	public static void main(String args[]){
	
	   int [][] sisData17=  null;
	   System.out.println(sisData17);
	   
	   sisData17 = new int [10][25];
	   
	   
	   java.util.Random rand  = new java.util.Random();
	   
      for(int batch=1;batch<=sisData17.length;batch++){
		 for(int stu=1;stu<= sisData17[batch-1].length;stu++){
		  int age  = rand.nextInt(5)+20;
		  sisData17[batch-1][stu-1] = age;
		 }
	 }
		
	   
	   
	   
	   
	   System.out.println("total batch  " +sisData17.length);
	   
      for(int batch=1;batch<=sisData17.length;batch++){
		 for(int stu=1;stu<= sisData17[batch-1].length;stu++){
		  int age  =  sisData17[batch-1][stu-1];
		  System.out.printf("%3d",age);
		 }
			System.out.println();
		 
	  }
			
	   
	   
	   
	   
	  
	}//end main

}//end class