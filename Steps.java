import java.util.*;


public class Steps{
	  static int steps(int source, int step, int dest) 
    { 
	
	if(source==dest){
      return step;
	}
	
	if(Math.abs(source)>dest){
		return Integer.MAX_VALUE;
	}
	int pos=steps(source+step+1,step+1,dest);
	int neg=steps(source-1-step,step+1,dest);
	return Math.min(pos,neg);
    } 
	
    public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int num=scan.nextInt();
	System.out.println(steps(0,0,num));
		
		
    }
}