import java.util.*;
public class First{
	public static void main(String args[]){
		Integer a=new Integer(100);
		Integer b=new Integer(200);
		Integer c=new Integer(100);
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(a);
		arr.add(c);
		arr.add(b);
		System.out.println(arr.toString());
		System.out.println(arr.size());
		
		
		HashSet<Integer>arr1=new HashSet<Integer>();
		arr1.add(a);
		arr1.add(c);
		arr1.add(b);
		System.out.println(arr1.toString());
		System.out.println(arr1.size());
		
		
		String s1=new String("anuj");
		String s2=new String("lalit");
		String s3=new String("anuj");
		ArrayList<String>arr2=new ArrayList<String>();
		arr2.add(s1);
		arr2.add(s2);
		arr2.add(s3);
		System.out.println(arr2.toString());
		System.out.println(arr2.size());
		
		
		HashSet<String>arr3=new HashSet<String>();
		arr3.add(s1);
		arr3.add(s2);
		arr3.add(s3);
		System.out.println(arr3.toString());
		System.out.println(arr3.size());
	}
}