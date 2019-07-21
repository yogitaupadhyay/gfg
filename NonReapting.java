import java.util.*;


public class NonReapting{
    public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String str=scan.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i),1);
			}
			
		}
for(Character id:map.keySet()){
	int res=map.get(id);
	if(res==1){
		System.out.println(id);
		System.exit(0);
	}
}
	System.out.println("0");
		
		
		
    }
}