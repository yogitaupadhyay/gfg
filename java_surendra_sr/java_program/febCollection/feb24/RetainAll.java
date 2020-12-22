import java.util.*;
public class RetainAll{
	public static void main(String args[]){
		ArrayList al=new ArrayList();
		al.add(new String("namrata"));
		al.add(new String("pratima"));
		al.add(new String("100rabh"));
		al.add(new String("lalit"));
		al.add(new String("shobhit"));
		al.add(new String("mohit"));
		al.add(new String("divyansh"));
		al.add(new String("rohit"));
		
		ArrayList notremovelist=new ArrayList();
	notremovelist.add(new String("namrata"));
		notremovelist.add(new String("pratima"));
		notremovelist.add(new String("100rabh"));
		
		System.out.println(al);
		System.out.println(al.retainAll(notremovelist));
		System.out.println(al);
		
		
}
}