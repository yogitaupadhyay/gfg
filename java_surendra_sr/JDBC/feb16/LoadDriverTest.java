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

  //Date  16/02/2019
 public class LoadDriverTest {

	public static void main(String args[]){
	String driverClassName = "oracle.jdbc.driver.OracleDriver";
	  try{
		Class.forName(driverClassName);
	    System.out.println("Driver Loaded successfuly");
	  }catch(ClassNotFoundException e){
	      System.out.println("given driver class not loaded"); 
	  }catch(Exception e){
	     System.out.println("Error " +e.getMessage());
	  }finally{
	   
	  }
	  
	}//end main

}//end class