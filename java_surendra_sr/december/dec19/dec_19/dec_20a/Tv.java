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

  //Date  19/12/2018
 public class Tv{ 
    String brandName;
	float price;
	int volume;
	boolean isOn;
	
	void on(){
	  System.out.println("tv on " );
	  isOn=true;
	}
	
	void off(){
	  System.out.println("tv off" );
	  isOn=false;
	}
	
	
	
	void show(){
	  System.out.println("tv showing...'" );
	}
	void volumeUp(){
	  System.out.println(volume + " tv vol up...'" +  ++volume);
	}
	
	void volumeDown(){
	  System.out.println(volume + " tv vol down...'" +  --volume);
	}
	
    void details(){
	 System.out.println("+++++++++++++++++++++++++++++");
	  System.out.println("brand name" +brandName);
	  System.out.println("price" +price);
	  System.out.println("volume " +volume);
	 System.out.println("+++++++++++++++++++++++++++++");
	}
 
 
 
 }//End of class 
