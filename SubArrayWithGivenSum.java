public class SubArrayWithGivenSum{
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
			int start=0;
			int end=0;
			for(int j=0;j<n;j++){
				int sum=0;
				int k=j;
				while(sum<=number&&k<n){
					sum=sum+arr[k];
					if(sum==number){
						for(int c=j;c<=k;c++){
				          System.out.print(arr[c]+" ");
			            }
						System.out.println("");
						break;
					}
					k++;
				}
				
			}
			
			
			
			
		
	}//end of main
}
}//end of class