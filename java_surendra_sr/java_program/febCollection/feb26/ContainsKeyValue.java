import java.util.*;

public class ContainsKeyValue{
	public static void main(String args[]){
	HashMap<Integer,String>map=null;
	map=new HashMap<Integer,String>();
	map.put(101,"ajay");
	map.put(102,"kajol");
	map.put(103,"aaliya");
	map.put(104,"varun");
	System.out.println("map= "+map);
	System.out.println(map.containsKey(101));
	System.out.println(map.containsKey(109));
	System.out.println(map.containsValue("kajol"));
	System.out.println(map.containsValue("damini"));
	
   }
}