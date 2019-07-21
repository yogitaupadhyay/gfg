import java.util.*;


public class SortTwo{
	  
    public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int num=scan.nextInt();
		int[]arr=new int[num];
	for(int i=0;i<num;i++){
		arr[i]=scan.nextInt();
	}
	int mid=0;
	int low=0;
	int high=num-1;
	while(mid<=high){
		switch(arr[mid]){
			case 0:
			int temp=arr[mid];
			arr[mid]=arr[low];
			arr[low]=temp;
			low++;
			mid++;
			break;
			case 1:
			mid++;
			
			break;
			case 2:
			int temp1=arr[mid];
			arr[mid]=arr[high];
			arr[high]=temp1;
			mid++;
			high--;
			break;
		}
	}
	for(int i=0;i<num;i++){
		System.out.print(arr[i]+"  ");
	}	
		
    }
}