import java.util.*;

public class PrintingMap{
	public static void main(String args[]){
	HashMap<Integer,String>map=null;
	map=new HashMap<Integer,String>();
	map.put(101,"ajay");
	map.put(102,"kajol");
	map.put(103,"aaliya");
	map.put(107,"kavita");
	map.put(106,"ramya");
	map.put(109,"pratima");
	map.put(104,"varun");
	System.out.println("map= "+map);
	Set<Integer>set=map.keySet();
	System.out.println(set.getClass());
	
	for(Integer k:set){
		String name=map.get(k);
		System.out.println(k+" = "+name);
	}
	System.out.println("====================values===============");
	Collection<String>set1=map.values();
	System.out.println(set1.getClass());
	
	for(String k:set1){
	
		System.out.println(k);
	}
	
   }
}