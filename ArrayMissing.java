import java.util.*;


public class ArrayMissing{
    public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int num=scan.nextInt();
		int[]arr=new int[num];
			
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<num-1;i++){
			
			if(arr[i+1]-arr[i]==2){
				System.out.println("missing="+( arr[i]+1));
			}
			if(arr[i+1]-arr[i]==0){
				System.out.println("repeated="+arr[i]);
			}
		}
	
		
		
    }
}