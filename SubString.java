public class SubString{
	public static void  substring1(String input,String output) {
		if(input.length()==0){
			System.out.println(output);
			return;
		}
		substring1(input.substring(1),output);
		substring1(input.substring(1),output+input.charAt(0));
	}
	
	
	
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the no of element in  array");
		int n=scan.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();	
		}
		
		String input=new String(arr);
		String output="";
		substring1(input,output);
	}
}