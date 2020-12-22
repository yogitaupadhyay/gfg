public class GreetDemo{
	public static void main(String args[])throws Exception{
		System.out.println("enter the class");
		
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String type=scan.nextLine();
		Class c=Class.forName(type);
		Object obj=c.newInstance();
		//SisgreetCUI s=new SisgreetCUI();
		//s.show();
		if(obj instanceof SisgreetCUI){
			SisgreetCUI s=(SisgreetCUI)obj;
			s.show();
		}else{
			SisgreetGUI g=(SisgreetGUI)obj;
			g.show();
			g.show();
		}
		
	}
	
}