import java.util.*;

public class Solution2{
	public static void main(String args[]){
		ArrayList<Dog> list=new<Dog> ArrayList();
		list.add(new Dog("tommy"));
		list.add(new Dog("tiger"));
		list.add(new Dog("jack"));
		list.add(new Dog("jenny"));
		list.add(new Bird());
		list.add(new java.util.Date());
		list.add(new String ("hi"));
		for(int i=1;i<=list.size();i++){
			Object ob=list.get(i-1);
			if(ob instanceof Dog){
			Dog d=(Dog)ob;
			d.bark();
			d.jump();
			}
		}
	}
}