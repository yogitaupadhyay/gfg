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
//java Welcome   nothin other   cui
//java Welcome cui
//java Welcome gui

 
 
  //Date  17/09/2018
 public class Welcome {

	public static void main(String args[]){
	String msg  = "welcome to java Career";
	
	String showOption ="cui";
	
	if(args.length==1){
	  showOption = args[0];
	}
	
	if("gui".equalsIgnoreCase(showOption)){
	  javax.swing.JOptionPane.showMessageDialog(null,msg);
	}else{
	  System.out.println("++++++++++++++++++++++++++");
	  System.out.println(msg);
	  System.out.println("++++++++++++++++++++++++++");
	}
	  
	}//end main

}//end class