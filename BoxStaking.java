package sis.com;

import java.util.Arrays;
import java.util.Comparator;

public class BoxStaking {
 static class Box implements Comparator<BoxStaking.Box> {
	 int lenght;
	 int width;
	 int height;
	 int area;
	Box(){
		
	}
	 Box(int length,int width,int height){
		 this.height=height;
		 this.width=width;
		 this.lenght=length;
				 
	 }
	 @Override
	public  int  compare(BoxStaking.Box obj1,BoxStaking.Box obj2){
	return -1*(obj1.area-obj2.area);
		 
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("ENTER no of boxes");
    java.util.Scanner scan=new java.util.Scanner(System.in);
    int n=scan.nextInt();
    Box []arr=new Box[3* n];
    for(int i=0;i<(3*n);i=i+3){
    	int l=scan.nextInt();
    	int w=scan.nextInt();
    	int h=scan.nextInt();
    	Box b=new Box(Math.max(w,l),Math.min(w,l),h);
    	arr[i]=b;
    	Box b1=new Box(Math.max(w,h),Math.min(w, h),l);
    	arr[i+1]=b1;
       	Box b2=new Box(Math.max(l, h),Math.min(l, h),w);
    arr[i+2]=b2;
    }
    
    for(int i=0;i<3*n;i++){
        arr[i].area=arr[i].lenght*arr[i].width;
        	
        }
    
    Arrays.sort(arr,new Box());  
    for(int i=0;i<3*n;i++){
    System.out.println(arr[i].lenght+" "+arr[i].width+" "+arr[i].height);
    	
    }
    //lis
    int totalHeight[]=new int[3*n];
    for(int i=0;i<3*n;i++){
       totalHeight[i]=arr[i].height;
               }
    int maxheight=0;
    for(int i=1;i<3*n;i++){
        for(int j=0;j<i;j++){
        	if(arr[j].lenght>arr[i].lenght&&arr[j].width>arr[i].width){
        		totalHeight[i]=Math.max(totalHeight[i],arr[i].height+arr[j].height);
        	if(maxheight<totalHeight[i]){
        		maxheight=totalHeight[i];
        	}
        	}
        }
       arr[i].height=totalHeight[i];
                }
    
    for(int i=0;i<3*n;i++){
    	System.out.print(arr[i].height+" ");
    	
        }
    System.out.println();
    for(int i=0;i<3*n;i++){
    	
    	System.out.print(totalHeight[i]+" ");
        }
    System.out.println();     
    
    System.out.println(maxheight);
     
    
    
    scan.close();
	}

}
