import java.util.*;

public class Append{
	public static void main(String args[]){
		ArrayList list=new ArrayList();
		list.add("aditya");
		list.add("lalit");
		list.add("pranav");
		list.add("sofia");
		
		
		ArrayList list2=new ArrayList();
		list2.add("amrata");
		list2.add("kamal");
		list2.add("gayatri");
		list2.add("chandi");
	System.out.println("list size"+list.size());
		list.addAll(list2);
	System.out.println(list2.size());
	System.out.println(list.size());
		
		
		ArrayList list3=new ArrayList();
		list3.add("sofia");
		list3.add("gaurav");
		list3.add("ram");
		list3.add("shyaam");
		
		
		ArrayList list4=new ArrayList();
		list4.add("abhishek");
		list4.add("revati");
		list4.add("mahima");
		list4.add("shlok");
	System.out.println("list size"+list3.size());
		list3.addAll(2,list4);
	System.out.println(list4.size());
	System.out.println(list3.toString());
	}
}