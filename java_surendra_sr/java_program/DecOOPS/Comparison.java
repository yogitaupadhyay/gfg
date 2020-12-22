public class Comparison{
	public static void main(String args[]){
int a=10;
int b=30;
int c=10;
System.out.println(a==b);
System.out.println(a==c);
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
String str="hello";
String str1="hello";
System.out.println("str==str1 : "+ (str==str1));

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
String str2=new String("hello");
String str3=new String ("hello");
System.out.println("str2==str3 : "+ (str2==str3));
System.out.println("str2.equals(str3 ): "+ (str2.equals(str3)));

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
sisString s=new sisString("hello");
sisString s1=new sisString("hello");
sisInteger s2=new sisInteger(20);
sisInteger s3=new sisInteger(20);
System.out.println("s==s1  :"+ (s==s1));
System.out.println("s2==s3 : "+ (s2==s3));
System.out.println("s.equals(s1 ): "+ (s.equals(s1)));
System.out.println("s2.equals(s3 ): "+ (s2.equals(s3)));

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	}
	
}