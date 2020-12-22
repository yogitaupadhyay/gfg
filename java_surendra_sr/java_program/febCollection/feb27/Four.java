import java.util.*;
public class Four {
	public static void main(String args[]){
		
		String a=new String("ajanta");
		String b=new String("colgate");
		String c=new String("ajanta");
		HashSet<String>arr=new HashSet<String>();
		arr.add(a);
		arr.add(c);
		arr.add(b);
		System.out.println(arr.toString());
		System.out.println(arr.size());
		
		SisString sisa=new SisString("ajanta");
		SisString sisb=new SisString("colgate");
		SisString sisc=new SisString("ajanta");
		HashSet<SisString >arr1=new HashSet<SisString >();
		arr1.add(sisa);
		arr1.add(sisc);
		arr1.add(sisb);
		System.out.println(arr1.toString());
		System.out.println(arr1.size());
		
	}
}