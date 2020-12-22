import java.util.*;

public class PutAll{
	public static void main(String args[]){
	HashMap<Integer,String>map=null;
	map=new HashMap<Integer,String>();
	map.put(101,"ajay");
	map.put(102,"kajol");
	map.put(103,"aaliya");
	map.put(104,"varun");
	System.out.println("map= "+map);
	
	HashMap<Integer,String>map1=null;
	map1=new HashMap<Integer,String>();
	map1.put(301,"lalit");
	map1.put(302,"saumya");
	map1.put(303,"vardhan");
	map1.put(304,"kalki");
	System.out.println("map1= "+map1);
   map.putAll(map1);
	System.out.println("map= "+map);
	map1.clear();
	System.out.println("map= "+map);
   }
}