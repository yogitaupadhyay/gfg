import java.util.*;

public class  CollectionUserDemo{
	public static void main(String args[]){
		ArrayList<SisInteger> list  = new ArrayList<SisInteger>();
		list.add(new SisInteger(234));
		list.add(new SisInteger(67));
		list.add(new SisInteger(24));
		list.add(new SisInteger(87));
		list.add(new SisInteger(45));
		list.add(new SisInteger(66));
		
		System.out.println("list="+list);
		System.out.println("size="+list.size());
		Collections.sort(list);
		System.out.println("list="+list);
		Collections.reverse(list);
		System.out.println("list="+list);
		Collections.shuffle(list);
		System.out.println("list="+list);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list,new SisInteger(66)));
		
	}
}