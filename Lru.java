import java.util.*;

public class Lru{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String str=scan.nextLine();
		int frameSize=Integer.parseInt(scan.nextLine());
		ArrayList<Character>arr=new ArrayList<Character>();
		System.out.println("str="+str);
		for(int i=0;i<str.length();i++)
		{
			if(arr.size()<frameSize&&!arr.contains(str.charAt(i))){
					arr.add(str.charAt(i));
			}else if((arr.size()<frameSize&&arr.contains(str.charAt(i)))){
				arr.remove(arr.indexOf(str.charAt(i)));
					arr.add(str.charAt(i));
			}else if(arr.size()>=frameSize){
				if(arr.contains(str.charAt(i))){
					arr.remove(arr.indexOf(str.charAt(i)));
					arr.add(str.charAt(i));
				}else{
					arr.remove(0);
					arr.add(str.charAt(i));
				}
				
			}
			for(Character data:arr){
				System.out.print(data);
				
			}
			System.out.println("");
			
		}
		
		
	}
}