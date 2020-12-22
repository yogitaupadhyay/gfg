import java.util.*;
public class ArrayListP{
	public static void main(String args[]){
		String ob1=new String("lalit");
		String ob2=new String("namrata");
		String ob3=new String("pratima");
		String ob4=new String("susma");
		ArrayList al=new ArrayList();
		System.out.println("size"+al.size());
		System.out.println("empty"+al.isEmpty());
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.add(ob4);
		System.out.println("size"+al.size());
		System.out.println("empty"+al.isEmpty());
		for(int e=1;e<=al.size();e++){
			System.out.println(al.get(e-1));
		}
	}
}