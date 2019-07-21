public class SubArrayWithGivenSum2{
	public static void main(String args[]){
		
		System.out.println("enter no of test case");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("enter no of element in array");
			int n=scan.nextInt();
			int number=scan.nextInt();
			int[]arr=new int[n];
			for(int j=0;j<n;j++){
				arr[j]=scan.nextInt();
			}
			int res=arr[0];
			int start=0;
			for(int j=1;j<n;j++){
				res=res+arr[j];
				
				 if(res>number){
					 while(res>number){
					res=res-arr[start];
					 start++;
					 }
				}
				if(res==number){
					for(int c=start;c<=j;c++){
				          System.out.print(arr[c]+" ");
			            }
						System.out.println("");
				}
				
			}
			
			
			
			
		
	}//end of main
}
}//end of class