public class MaximumSumSubArray{
	public static void main(String args[]){
		System.out.println("enetr the no elements in array");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			
		}
		int maximumSoFar=arr[0]; 
		int index=0;
		int sum=0;
		int start=0;
		int end=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
			System.out.println("sum="+sum);
			if(sum>maximumSoFar){
				maximumSoFar=sum;
				end=i;
			}
			if(sum<0){
			sum=0;
			start=i+1;
			}
			
		}
		System.out.println("start="+start);
		System.out.println("end="+end);
		System.out.println("maximumSoFar"+maximumSoFar);
		for(int i=start;i<=end;i++){
			System.out.println(arr[i]+" ");
		}
		
	}
}