import java.util.*;
import java.io.*;

public class Train1{
	public static void main(String args[]){
		Random rand=new Random();
		for(int i=1;i<=10;i++){
			int id=rand.nextInt(1000000);
			int price=rand.nextInt(210)+100;
			String name="name1";
			boolean isAvailable=rand.nextBoolean();
			System.out.printf("%8d",id);
			System.out.printf("%20s",name);
			System.out.printf("%8d",price);
			System.out.printf("%15s",isAvailable);
			System.out.println();
		}
	}
}