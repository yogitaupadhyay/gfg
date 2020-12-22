import java.util.HashMap;
public class HashMapWithObject{
	public static void main(String args[]){
		Integer a=new Integer(1);
		Integer b=new Integer(2);
		Integer c=new Integer(3);
		Integer d=new Integer(4);
		Integer e=new Integer(5);
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(a,new String("one"));
		map.put(b,new String("two"));
		map.put(c,new String("three"));
		map.put(d,new String("four"));
		map.put(e,new String("five"));
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.get(a));
		System.out.println(map.get(b));
		System.out.println(map.get(c));
		System.out.println(	map.get(d));
		System.out.println(map.get(e));
		
		
		SisInteger a1=new SisInteger(1);
		SisInteger b1=new SisInteger(2);
		SisInteger c1=new SisInteger(3);
		SisInteger d1=new SisInteger(4);
		SisInteger e1=new SisInteger(5);
		HashMap<SisInteger,String>map1=new HashMap<SisInteger,String>();
		map1.put(a1,new String("one"));
		map1.put(b1,new String("two"));
		map1.put(c1,new String("three"));
		map1.put(d1,new String("four"));
		map1.put(e1,new String("five"));
		System.out.println(map1.size());
		System.out.println(map1);
		
		System.out.println(map1.get(new SisInteger(1)));
		System.out.println(map1.get(b1));
		System.out.println(map1.get(c1));
		System.out.println(	map1.get(d1));
		System.out.println(map1.get(e1));
		
	}
}