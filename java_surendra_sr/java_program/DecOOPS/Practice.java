public class Practice{
   public static void main(String args[]){
	  java.util.Scanner scan=new java.util.Scanner(System.in);
	  System.out.println("eneter the first string ");
	  String s1=scan.nextLine();
	  System.out.println("eneter the second string ");
	  String s2=scan.nextLine();
	 
	  int c=0;
	  for(int i=0;i<s1.length();i++){
		 
		 if(s2.indexOf(s1.charAt(i))>=0){
			  System.out.println(s2.indexOf(s1.charAt(i)));
			  c++;
			  
		 }
	  }
	  if(c==s1.length()){
	  System.out.println("all character of first string is present in second one");
		  
		  
	  }
	  
	   
	   
	   
   }


}