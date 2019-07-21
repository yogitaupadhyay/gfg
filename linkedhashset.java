import java.util.*;
public class linkedhashset{
	public static void main(String args[]){
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		set.add(23);
		set.add(24);
		set.add(25);
		set.add(26);
		set.add(27);
		set.add(28);
		set.add(29);
		System.out.println(set);
		Iterator <Integer>it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}