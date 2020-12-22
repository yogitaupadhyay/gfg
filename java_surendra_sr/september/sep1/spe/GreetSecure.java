
  //Date  01/09/2018
 public class GreetSecure {

	public static void main(String args[]){

		java.io.Console con = System.console();
		
	String []users={"sis","nit","student","trainer"};
	String []passwords={"123","123","abcd","abcd"};
	   
	   String user;
	   String password;
	   
	   System.out.print("enter user name>> ");
	   user  = con.readLine();
	   System.out.print("enter user password");
	   password  =new String(con.readPassword());
	   
	   boolean isLoginSuccess=false;
	   
	   for(int u=1;u<=users.length;u++){
	     String dbUser= users[u-1];
		 String dbPassword= passwords[u-1];
		 
		 boolean c1  = dbUser.equals(user);
		 boolean c2  = dbPassword.equals(password);
		 if( c1&& c2){
		      isLoginSuccess  =true;
			  break;
		 }
	   
	   }//for
	   
	if(isLoginSuccess==false){
	System.out.println("invalid user or password");
		return ;
	}
	
	  System.out.println("Welcome user  " + user  );
	  
	}//end main

}//end class