public class Req3{
	public static void main(String args[]){
		java.util.Scanner scan =new java.util.Scanner(System.in);
		try{
		System.out.println("enter the array size");
		int arraySize=Integer.parseInt(scan.nextLine());
		String arr[]=new String [arraySize];
		for(int i=1;i<=arr.length;i++){
		System.out.println("enter the stu name");
		arr[i-1]=scan.nextLine();
		}
		}catch(NegativeArraySizeException e){
			
		System.out.println("array size cannot be negative");
		}catch(NumberFormatException e){
			
		System.out.println("array size must be a integer");
		}
			
		
	}
}