import java.util.*;
import java.io.*;
public class Properties1 {
	public static void main(String args[])throws Exception{
		Properties pro=new Properties();
		pro.setProperty("key1","value1");
		pro.setProperty("key2","value2");
		pro.setProperty("key3","value3");
		pro.setProperty("key4","value4");
		pro.setProperty	("key5","value5");
		System.out.println(pro);
		//pro.getProperty("key1");
		System.out.println(pro.getProperty("key2"));
		System.out.println(pro.getProperty("key3"));
		pro.load(new FileReader("user.properties"));
		System.out.println(pro);
		System.out.println(pro.getProperty("user"));
		// public java.util.Enumeration<?> propertyNames();
		Enumeration<String>e=(Enumeration<String>)pro.propertyNames(); 
		System.out.println("+++++++++++++++++++++++++++++++++++++==");
		while(e.hasMoreElements())
		{
		String s=e.nextElement();
		System.out.println(s+"="+pro.getProperty(s));
			
		}
System.out.println("=================================================");		
System.out.println("user.language = "+System.getProperty("user.language"));		
System.out.println("user.name = "+System.getProperty("user.name"));		
System.out.println("user.country = "+System.getProperty("user.country"));		
System.out.println("user.separator = "+System.getProperty("user.separator"));		
System.out.println("user.home = " +System.getProperty("user.home"));		

System.out.println("=================================================");		
	
	pro.setProperty("name","yogi");
	pro.store(new FileOutputStream("user.properties"),"adding new elemeb=nt");
	
	}
}