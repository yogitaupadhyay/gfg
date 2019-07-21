import java.util.*;
public class MaximumNoOfPlateform{
	public static void main(String args[]){
		System.out.println("eneter no of trains");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		TreeMap<Float ,Character>map=new TreeMap<Float,Character>();
		
		for(int i=0;i<n;i++){
			Float Atime=scan.nextFloat();
			map.put(Atime,'a');
			Float Dtime=scan.nextFloat();
			map.put(Dtime,'d');
			
		}
		int res=0;
		int max=0;
		 Set<Map.Entry<Float, Character>> set = map.entrySet();

   
		for(Map.Entry<Float, Character>data:set){
			if(data.getValue()=='a'){
				res++;
			}else{
				res--;	
			}
			if(res>max){
					max=res;
				}
		}
		System.out.println(max);
		
	}
}