import java.util.*;

public class Get{
	public static void main(String args[]){
		ArrayList list=new ArrayList();
		list.add("aditya");
		list.add("lalait");
		list.add("pranav");
		list.add("sofia");
		for(int i=0;i<list.size();i++){
			Object ob=list.get(i);
			System.out.println(ob);
			System.out.println("tostring "+ob.toString());
			String s=(String)ob;
			System.out.println("uppercase=  "+s.toUpperCase());
			
		}
	}
}