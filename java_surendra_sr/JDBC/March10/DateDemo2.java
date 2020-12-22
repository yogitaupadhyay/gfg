import java.text.*;


public class DateDemo2{
	public static void main(String args[]){
java.util.Date d1=new java.util.Date();
      SimpleDateFormat sdf=null;
     sdf=new SimpleDateFormat("MMMM-YYYY-dd");
	 System.out.println(sdf.format(d1));
	 sdf.applyPattern("EEE");
	 System.out.println(sdf.format(d1));
	 sdf.applyPattern("EEEE");
	 System.out.println(sdf.format(d1));
	 sdf.applyPattern("EEEE dd-MM-yy");
	 System.out.println(sdf.format(d1));
		sdf.applyPattern("EEEE dd-MMM-yy");
	 System.out.println(sdf.format(d1));
	 sdf.applyPattern("EEEE dd-MMM-YYYY");
	 System.out.println(sdf.format(d1));
	}
}