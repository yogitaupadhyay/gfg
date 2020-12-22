import java.util.*;

public class MapDemo{
	public static void main(String args[]){
	HashMap<Integer,String>map=null;
	map=new HashMap<Integer,String>();
	map.put(101,"ajay");
	map.put(102,"kajol");
	map.put(103,"aaliya");
	map.put(104,"varun");
	System.out.println("map= "+map);
	System.out.println("101= "+map.get(101));
	System.out.println("104= "+map.get(104));
	System.out.println("105= "+map.get(105));
	System.out.println(map.remove(103));

	System.out.println("map= "+map);
	
	
	
   }
}