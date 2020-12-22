import java.util.*;
import java.sql.*;

public class DateDemo{
	public static void main(String args[]){
		java.util.Date d1=new java.util.Date();
		java.util.Date d2=new java.util.Date(System.currentTimeMillis());
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		long t1=d1.getTime();
		long t2=d2.getTime();
		System.out.println(t1);
		System.out.println(System.currentTimeMillis());
		System.out.println(t2);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		java.sql.Date sd1=new java.sql.Date(System.currentTimeMillis());
		System.out.println(sd1);
		long st1=sd1.getTime();
		System.out.println(st1);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  		
		java.sql.Timestamp ts1=new java.sql.Timestamp(System.currentTimeMillis());
		java.sql.Timestamp ts2=new java.sql.Timestamp(d1.getTime());
		System.out.println(ts1);
		System.out.println(ts2);
		
	}
}