
/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class Demo1 {

	 
	public static void main(String[] args) {
		 
		
	//String msg ="java";
	//String msg ="java";
	//String msg ="cpp";
	String msg ="cpp";
		m1(msg);
	}

	 
	private static void m1(String msg) {
	 
		/*try {
			System.out.println("msg "+ msg);
			System.out.println("3rd char "+msg.charAt(3));
			System.out.println("I will Always be happy & programming");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println("msg "+ msg);
			System.out.println("3rd char "+msg.charAt(3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("I will Always be happy & programming");
			e.printStackTrace();
		}catch (Exception e) {
		}*/
		
		/*
		
		try {
			System.out.println("msg "+ msg);
			System.out.println("3rd char "+msg.charAt(2));
			if("php".equals(msg))return;
			
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("I will Always be happy & programming");
		*/
		
		

		
		try {
			System.out.println("msg "+ msg);
			System.out.println("3rd char "+msg.charAt(2));
			if("php".equals(msg))return;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			 //resouce  release  close 
			System.out.println("I will Always be happy & programming");
		}
		
		
		
	}
	
	

}
