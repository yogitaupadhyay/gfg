import java.util.*;

public class MaxValue{
	public static void main(String args[]){
		
		System.out.println("enter no of element in the array");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		int [] arr=new int[n];
		boolean negative=false;
		boolean positive=false;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int firstp=0;
		int firstn=0;
	int index=0;
	int max_index=0;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			if(arr[i]>0&&positive==false){
				firstp=i;
				positive=true;
			}
			if(arr[i]<0&&negative==false){
				firstn=i;
				negative=true;
			}
			if(min>arr[i]){
				min=arr[i];
				index=i;
				}
				
				if(max<arr[i]){
				max=arr[i];
				max_index=i;
				}
				
		}
		//System.out.println("positive="+positive);
		//System.out.println("negaive="+negative);
		
		if(positive&&negative){
			int c=0;
			for(int i=0;i<n;i++){
				
			if(arr[i]>0&&i!=firstp){
				arr[firstn]=arr[firstn]-arr[i];
				arr[i]=0;
				c++;
			}else if(arr[i]<0&&i!=firstn){
				arr[firstp]=arr[firstp]-arr[i];
				arr[i]=0;
				c++;
			}	
			}
			arr[firstp]=arr[firstp]-arr[firstn];
			arr[firstn]=0;
			for(int data:arr){
				System.out.print(data+ " ");
			}
			System.out.println(arr[firstp]);
			}
		
		else if(positive){
			for(int i=0;i<n;i++){
			if(i!=index){
				count++;
				if(count!=n-1){
					arr[index]=arr[index]-arr[i];
					arr[i]=0;
				}else if (count==n-1){
					arr[i]=arr[i]-arr[index];
					arr[index]=0;
					
					System.out.println(arr[i]);
					break;
				}
			}
			
			}
			
		}
			
		else if(negative){
			for(int i=0;i<n;i++){
			if(i!=max_index){
				arr[max_index]=arr[max_index]-arr[i];
				arr[i]=0;
			}
			for(int data:arr){
				System.out.print(data+ " ");
			}
			System.out.println("");
			}
			System.out.println(arr[max_index]);
			
		}
		
		
	}
}