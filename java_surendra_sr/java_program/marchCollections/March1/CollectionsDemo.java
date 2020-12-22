import java.util.*;

public class  CollectionsDemo{
	public static void main(String args[]){
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		System.out.println("list="+list);
		System.out.println("size="+list.size());
		Collections.sort(list);
		System.out.println("list="+list);
		Collections.reverse(list);
		System.out.println("list="+list);
		Collections.shuffle(list);
		System.out.println("list="+list);
		System.out.println(Collections.binarySearch(list,3));
		
	}
}