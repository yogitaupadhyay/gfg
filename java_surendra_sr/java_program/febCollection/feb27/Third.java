import java.util.*;
public class Third {
	public static void main(String args[]){
		
		Integer a=new Integer(100);
		Integer b=new Integer(200);
		Integer c=new Integer(100);
		HashSet<Integer>arr=new HashSet<Integer>();
		arr.add(a);
		arr.add(c);
		arr.add(b);
		System.out.println(arr.toString());
		System.out.println(arr.size());
		
		SisInteger sisa=new SisInteger(100);
		SisInteger sisb=new SisInteger(200);
		SisInteger sisc=new SisInteger(100);
		HashSet<SisInteger>arr1=new HashSet<SisInteger>();	
		arr1.add(sisa);
		arr1.add(sisb);
		arr1.add(sisc);
		
		System.out.println(arr1.toString());
		System.out.println(arr1.size());
		
		
		
	}
}