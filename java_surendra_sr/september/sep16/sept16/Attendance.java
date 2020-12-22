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

  //Date  16/09/2018
 public class Attendance {

	public static void main(String args[]){
	
	   boolean [] stuAtt =new boolean [25]; //false
	    
		/*
	   for(int stu=1;stu<=stuAtt.length;stu++){
	     stuAtt[stu-1] =true;
	   }
	   */
	   java.util.Arrays.fill(stuAtt,true);
	   
	   for(int stu=1;stu<=stuAtt.length;stu++){
	    // System.out.println("sid"+stu +" is Present " +stuAtt[stu-1]);
	     System.out.println("sid"+stu +" is Present " + (stuAtt[stu-1] ?" yes" :" no " ) );
	   }
	   
	   
	  
	}//end main

}//end class