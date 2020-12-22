import java.util.*;

public class Search{
	public static void main(String args[]){
		ArrayList list=new ArrayList();
		list.add("aditya");
		list.add("lalit");
		list.add("pranav");
		list.add("sofia");
		
		
		ArrayList list2=new ArrayList();
		list2.add("aditya");
		list2.add("lalit");
		System.out.println(list.indexOf("aditya"));
		System.out.println(list.contains("aditya"));
		System.out.println(list.contains("adit"));
		System.out.println(list.contains("adit"));
		
		System.out.println("contains all"+list.containsAll(list2));
		
		ArrayList list3=new ArrayList();
		list3.add("aditya");
		list3.add("lalit");
		list3.add("kanak");
		System.out.println("contains all"+list.containsAll(list3));
    }
}