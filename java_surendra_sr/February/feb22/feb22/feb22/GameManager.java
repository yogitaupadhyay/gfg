import java.util.Arrays;
import java.util.Scanner;

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
 
   CurrentYear 2019 
 */

public class GameManager {
   User user1;  
   User user2;
   
   void createUsers() {
		Scanner scan = new Scanner(System.in);
		String user1Name;
		String user2Name;
		System.out.println("Enter first user name");
		user1Name = scan.nextLine();
		System.out.println("Enter 2nd  user name");
		user2Name = scan.nextLine();
		user1 = new User(user1Name);
		user2 = new User(user2Name);
   }

public void showUserDetails() {
	showUserDetails(user1);
	showUserDetails(user2);
	
}

private void showUserDetails(User user) {
	System.out.println("______________________________");
	System.out.println("user Name "+ user.getName());
	System.out.println("data "+Arrays.toString(user.getRolledData()));
	System.out.println("______________________________");
}

public void startGame() {
	
	//roll by user 1
	
	while(	(user1.isComplete()||user2.isComplete()) ==false) {
			gameDelay(200);
			userInputProcess(user1);
			System.out.println("____________________________________");
			gameDelay(200);
			userInputProcess(user2);
	}
	//after input completed
	//winner is
	
	if(user1.isComplete()) {
		System.out.println("winner is "+user1.getName());
		
	}else {
		System.out.println("winner is "+user2.getName());
	}
	   
	  
	 
	
}
 
private void gameDelay(int delayTime) {
	try {Thread.sleep(delayTime);} catch (Exception e) {}
}

private void userInputProcess(User user) {
	User currentPlayer;
	currentPlayer  = user;
	  int diceNumber=-1;
	  do {
		  diceNumber = Dice.roll();
		  System.out.println(currentPlayer.getName() +" dice Number is " + diceNumber);
		  currentPlayer.updateData(diceNumber);
	  }while(diceNumber==6);
}
   
   
   
}
