import java.util.*;

public class NextGreaterElement2{
	public static void main(String args[]){
		System.out.println("eneter the array size");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(arr[0]);
		for(int i=1;i<n;i++){
			while(!stack.isEmpty()){
			int poped=stack.pop();
			
			if(poped<arr[i]){
				System.out.println(arr[i]+">"+poped);
			}else{
				stack.push(poped);
				break;
			}
			}
			stack.push(arr[i]);
		}
	}
}