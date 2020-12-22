import java.util.*;

public class  HshmapWITHnull{
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
	map.put(109,"shobhit");
	map.put(null,"kamal");
	map.put(110,"null");
	System.out.println("map= "+map);
	
	
   }
}