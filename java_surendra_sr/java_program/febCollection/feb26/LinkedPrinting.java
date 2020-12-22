import java.util.*;

public class LinkedPrinting{
	public static void main(String args[]){
	LinkedHashMap<Integer,String>map=null;
	map=new LinkedHashMap<Integer,String>();
	map.put(101,"ajay");
	map.put(102,"kajol");
	map.put(103,"aaliya");
	map.put(107,"kavita");
	map.put(106,"ramya");
	map.put(109,"pratima");
	map.put(104,"varun");
	System.out.println("map= "+map);

	for(Integer k:map.keySet()){
		
		System.out.println(k+" = "+map.get(k));
	}
	System.out.println("====================values===============");
	Collection<String>set1=map.values();
	System.out.println(set1.getClass());
	
	for(String k:set1){
	
		System.out.println(k);
	}
	
   }
}