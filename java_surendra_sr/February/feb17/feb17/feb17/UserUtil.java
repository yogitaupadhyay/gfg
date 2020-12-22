import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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

public class UserUtil {
	
	private static final String fileName="user.sis";	
	public static String getName() {
		String name = null;		 
	     BufferedReader br  = null;
	     try {
			br  = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			String[] fieldData = line.split("=");
			//String kye =fieldData[0]; 
			name =fieldData[1]; 
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//if
		}//finally
	return name;	
	}

	public static void changeUserName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter user new name");
		String editName = scan.nextLine();
		FileWriter fw  = null;
		try {
			fw  = new FileWriter(fileName);
			fw.write("user="+editName);
			System.out.println("user name changed");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				try {
					fw.close();
					System.out.println("Records saved " + fileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//if
		}//finally
		
	}

}
