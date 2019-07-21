import java.util.*;
public class Testing1{
	static int a;
	static void show(){
		System.out.println("a="+a);
	}
	public static void main(String args[]){
		Testing t=new Testing();
		t.a=10;
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(t.a);
		t.show();
		t.a=20;
	arr.add(t.a);
	for(int data:arr){
		System.out.println(data);
	}
	
	}
}