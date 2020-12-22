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
 public class SisRemote {

	public static void main(String args[]){
		SmartTv mySmartTv  = new SmartTv();
		mySmartTv.price=200000;
		mySmartTv.brandName="Samsung";
	
	
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	while(true){
	
	    System.out.println("want you want ");
		System.out.println("1 : Start  " );
		System.out.println("2 : Stop " );
		System.out.println("3:  show" );
		System.out.println("4 :  VOL++" );
		System.out.println("5 :  VOL--" );
		System.out.println("6 : Details " );
		System.out.println("7 :  Connect USB" );
		System.out.println("8 :  Disconnect USB" );
		System.out.println("9 :  Game Option" );
		System.out.println("10 :  exit" );
		
	     int actionOption  = Integer.parseInt(scan.nextLine());
		 
          switch(actionOption){
		  
				case 1 :
						mySmartTv.on();
				break; 
				
				case  2 :
					mySmartTv.off();
				break;
				
				case 3:     
					mySmartTv.show();
				break;
				
				case 4:
					mySmartTv.volumeUp();
				break;
				
				case 5: 
					mySmartTv.volumeDown();
				break;
				
				case 6:
					mySmartTv.details();
				break;
				
				case 7:       
					mySmartTv.usbConnect();
				break;
				
				case 8: 
					mySmartTv.usbDisConnect();
				break;
				
				case 9:
					mySmartTv.gameOption();
				break;
				
				case 10 : 
					System.out.println("Good Bye  , See you very soon , waiting...");
					System.exit(0);
				break;
				default : System.out.println("invalid option "); break;
			
		  }	//end switch	

	}
	
	
	  
	}//end main

}//end class