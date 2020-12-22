import java.util.*;
public class Remove{
	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add(new String("namrata"));
		al.add(new String("pratima"));
		al.add(new String("pratima"));
		al.add(new String("lalit"));
		System.out.println("al="+al);
		System.out.println(al.remove("pratima"));
		System.out.println("al="+al);
		System.out.println("remove pranav");
		System.out.println(al.remove("pranav"));
		//removing via position -method of list interface
		System.out.println("remove namrata");
		System.out.println(al.remove(0));
		
		
	}
}