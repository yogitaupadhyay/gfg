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
 public class SmartTv  extends Tv{ 
    boolean isGameOn;
	boolean isUsbPluged;
	String [] gameList  ={"Card","Mario","CandyCrush"};
	
	void usbConnect(){
		isUsbPluged =true;
		System.out.println("usb connected");
	}
	
	void usbDisConnect(){
		isUsbPluged =false;
		System.out.println("usb dis-connected");
	}
	
	void gameOption(){
	    for(int g=1;g<=gameList.length;g++){
		  System.out.println("game #"+g  +"  : " + gameList[g-1] );
		}
	    System.out.println("which game you want to play");
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		int gameNo = scan.nextInt();
		gameStart(gameNo);
		
	}
	
	 void gameStart(int gameNo){
		   System.out.println("Loading....");
		   try{ Thread.sleep(5000);	   }catch(Exception e){   }
		  System.out.println("Game " + gameList[gameNo-1] +" started....");
		}
 
 
 
 }//End of class 
