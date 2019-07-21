import java.util.*;

public class  LRUCatche{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		System.out.println("eneter refernce STRING");
        String referncestr=scan.nextLine();	
		long refernce=Long.parseLong(referncestr);
		long[] arr=new long[referncestr.length()];
		int i=arr.length-1;
		while(refernce>0){
			arr[i]=refernce%10;
			refernce=refernce/10;
			//System.out.println("arr ="+arr[i]);
			i--;
		}
		int fsize=scan.nextInt();
	     LinkedList<Long>frame=new LinkedList<Long>();
	for(int n=0;n<arr.length;n++){
		if(frame.size()<3&&!frame.contains(arr[n])){
			frame.addFirst(arr[n]);
		}else if(frame.contains(arr[n])){
			frame.remove(frame.indexOf(arr[n]));
			frame.addFirst(arr[n]);
		}else if(frame.size()==3){
			frame.removeLast();
			frame.addFirst(arr[n]);
			
		}
		for(long data:frame){
			System.out.print(data+" ");
		}
		System.out.println();
	}
	
	
	
	}//end of main
}//end of class