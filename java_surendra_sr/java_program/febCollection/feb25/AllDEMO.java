import java.util.*;
public class  AllDEMO{
	public static void main(String args[]){
		ArrayList<Character>list=new ArrayList<Character>();
		list.add('a');
		list.add('f');
		list.add('b');
		list.add('c');
		list.add('c');
		list.add('d');
		list.add('g');
		list.add('e');
		list.add('f');
		System.out.println("size "+list.size());
		System.out.println("list-as it is like array"+list);
		
		HashSet<Character>set=new HashSet<Character>();
		set.add('a');
		set.add('f');
		set.add('b');
		set.add('c');
		set.add('c');
		set.add('d');
		set.add('g');
		set.add('e');
		set.add('f');
		System.out.println("size "+set.size());
		System.out.println("set-duplicate remove -no indexing"+set);
		
		LinkedHashSet<Character>lset=new LinkedHashSet<Character>();
		lset.add('a');
		lset.add('f');
		lset.add('b');
		lset.add('c');
		lset.add('c');
		lset.add('d');
		lset.add('g');
		lset.add('e');
		lset.add('f');
		System.out.println("size "+lset.size());
		System.out.println("lset-duplicate remove-stable "+lset);
		
		TreeSet<Character>tset=new TreeSet<Character>();
		tset.add('a');
		tset.add('f');
		tset.add('b');
		tset.add('c');
		tset.add('c');
		tset.add('d');
		tset.add('g');
		tset.add('e');
		tset.add('f');
		System.out.println("size "+tset.size());
		System.out.println("tset-duplicate remove-sorted"+tset);
	}
}