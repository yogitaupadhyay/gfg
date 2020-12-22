public class Remote{
	public static void main(String []args){
		SmartTv myTv=new SmartTv();
		java.util.Scanner scan =new java.util.Scanner(System.in);
	while(true){
		System.out.println("which action u want to perform");
		System.out.println("1.on");
		System.out.println("2.off");
		System.out.println("3.voulume up");
		System.out.println("4.volume down");
		System.out.println("5.Connect USB");
		System.out.println("6.disconnect USB");
		System.out.println("7.Play game");
		System.out.println("8.exit");
		int option=Integer.parseInt(scan.nextLine());
		switch(option){
			case 1:  
			myTv.on();
			break;
			
			case 2:  
			myTv.off();
			break;
			
		  
			case 3:  
			myTv.volumeUp();
			break;
			
			case 4:  
			myTv.voulumeDown();
			break;
			 
			case 5:  
			myTv.connectUsb();
			break;
			
			case 6 :  
			myTv.DisconnectUsb();
			break;
			
			case 7 :  
			myTv.playGame();
			break;
			
			case 8:  
			System.exit(0);
			break;
			
			
			
}


	}
		
	}
	
	
}