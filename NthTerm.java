import java.util.*;
public class NthTerm{
	public static void main(String args[]){
		System.out.println("enter a b c and n");
	java.util.Scanner scan=new java.util.Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int n=scan.nextInt();
	int pa=a,pb=0,pc=0;
	
	HashSet<Integer>arr=new HashSet<Integer>();
	arr.add(a);
	while(arr.size()<n){
		if((pa+a)<=pb+b&&(pa+a)<=pc+c){
			pa=pa+a;
			System.out.println("pa="+pa);
			arr.add(pa);
		}else if((pb+b)<=pa+a&&(pb+b)<=pc+c){
			pb=pb+b;
			System.out.println("pb="+pb);
			arr.add(pb);
		}else if((pc+c)<=pa+a&&(pc+c)<=pb+b){
			pc=pc+c;
			System.out.println("pc="+pc);
			arr.add(pc);
		}
		
	}
	for(int data:arr){
		System.out.print(data+" ");
	}
		
		
		
		
		
		
	}
}