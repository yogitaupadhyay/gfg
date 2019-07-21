import java.util.*;


public class Decimal{
    public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		Integer n=scan.nextInt();
		Integer d=scan.nextInt();
		float res=n/d;
		int rem=n%d;
		System.out.println(rem);
		HashMap<Integer ,Integer>map=new HashMap<Integer,Integer>();
		int i=1;
		int repeat=0;
		while(rem!=0){
			if(!map.containsKey(rem)){
			map.put(rem,i);i++;
			}else{
			 repeat=map.size()-map.get(rem);
				break;
			}
			res=res+(((float)rem*10)/d)/10;
			System.out.println(res);
			rem=((rem*10)%d);	
		}
		String str=res+"";
		System.out.println("res="+res);
		str=str.substring(0,str.length()-repeat)+"("+str.substring(-(repeat+1))+")";
		System.out.println("str="+str);
		 
		
    }
}