package ama.com;
import java.util.*;
public class k {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scan=new Scanner(System.in);
        System.out.println("enter n");
        int t=scan.nextInt();
        
        for(int c=0;c<t;c++){
            int n=scan.nextInt();
            int sum=1;int psum=1;
            int i=0;
            int m=1;
            while(i<n){
                System.out.print(sum+" ");
                psum=sum;
                sum=m*2;
                int k=sum-psum;
                if(i<n){
				System.out.print(k+" ");
				i++; 
				
				}
                i++;
                m++;
                }
            System.out.println();


}
}

                }