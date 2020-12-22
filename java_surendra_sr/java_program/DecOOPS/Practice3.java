public class Practice3{
	public static void main(String args[]){
System.out.println("enter the given string");
java.util.Scanner scan =new java.util.Scanner(System.in);
		String str=scan.nextLine();
		String str2="";
		for(int i=(str.length()-1);i>=0;i--){
			str2=str2+str.charAt(i);
			
		}
		int c=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==str2.charAt(i)){
				c++;
			}else{
				System.out.println("string is not palindrome");
				System.exit(0);
			}
			
		}
		if(c==str.length()){
			System.out.println("string is palindrome");
			
		}
		/*if(str.equalsIgnoreCase(str2)==true){
System.out.println("string is palindrome");
			}else{
System.out.println("string is not palindrome");
				
			}*/

		
	}
	
}