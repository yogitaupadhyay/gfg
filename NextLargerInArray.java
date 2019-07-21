import java.util.*;

public class NextLargerInArray{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++){
		int n=scan.nextInt();
		int[]arr=new int[n];
		for(int j=0;j<n;j++){
			arr[j]=scan.nextInt();	
		}
		Stack<Integer>stack=new Stack<Integer>();
		
		for(int k=0;k<n;k++){
			if(k==0){
				stack.push(arr[k]);
			}else{
			int next=arr[k];	
			
			while(!stack.isEmpty()){
				 int curr=stack.pop();
				if(curr<next){
				System.out.print(next +" ");
				
				}else{
					stack.push(curr);
					break;
				}
			}
			stack.push(next);
			}
		}
			System.out.print("-1");
			System.out.println();
		}
		
		
		
		
	}
}