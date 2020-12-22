public class SmartTv extends Tv{
	boolean isUsbPlugged;
	boolean isGameOn; 
	String gameList[]={"mario","cards","candycrush"};
	 void connectUsb(){
		 System.out.println("UsB CONNECTED ");
	 }
	 void DisconnectUsb(){
		 System.out.println("UsB CONNECTED ");
		 
	 }
	 java.util.Scanner scan= new java.util.Scanner(System.in);
	 void playGame(){
		 
		 System.out.println("starting..");
		 System.out.println("CHOOSE GAME..");
		 System.out.println("1:"+ gameList[0]);
		 System.out.println("2:"+ gameList[1]);
		 System.out.println("3:"+gameList[2]);
		 int opt=Integer.parseInt(scan.nextLine());
		 
		 try{
		 Thread.sleep(1000);
		 }catch(Exception e){
			 
		 }
		 System.out.println(gameList[opt-1]+"started");
		 
		 
	 }
	 
	 
	
	
	
}