package ama.com;
import java.util.*;

public class FirstCount {
static int searchOne(int []arr,int low,int high){
   while(low<=high){
       int mid=(low+high)/2;
       if(arr[mid]==1&&mid-1<0||arr[mid]==1&&arr[mid-1]==0){
           return mid;
       }else{
           System.out.println("low="+low+"mid="+mid+"high="+high);
       if(arr[mid]==0){
           low=mid+1;
           high=high;
       }else{
           high=mid-1;
           low=low;
       }
   }
   }
   return -1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	//	System.out.println("enter t");
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
		}
			int res=searchOne(arr,0,n-1);
			System.out.println(res);
			
			
		}

	}

}
