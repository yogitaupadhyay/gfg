public class Savings{
	public static void main(String args[]){
		System.out.println("enter the no cities");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++){
			arr[j]=scan.nextInt();
		}
		int sum=0;int res=0;
		for(int j=0;j<n;j++){
			sum=sum+arr[j];
			//System.out.println("sum="+sum);
			if(sum<=0){
				sum=-sum;
				if(res<=sum){
				res=sum+1;
				System.out.println("res="+res);
				sum=1;
				}
			}
		}
		System.out.println("res"+res);
		
		
	}
	
}