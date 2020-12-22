import java.util.*;
import java.io.*;

public class Train2{
	public static void main(String args[]){
			String allData="";
		Random rand=new Random();
		for(int i=1;i<=10;i++){
			int id=rand.nextInt(1000000);
			int price=rand.nextInt(210)+100;
			String name="name"+i;
			boolean isAvailable=rand.nextBoolean();
			
			String idstr=String.format("%10d",id);
			String namestr=String.format("%20s",name);
			String pricestr=String.format("%10d",price);
			String isAvailablestr=String.format("%15s",isAvailable);
			
			allData=allData+idstr;
			allData=allData+namestr;
			allData=allData+pricestr;
			allData=allData+isAvailablestr;
			allData = allData + "\n";
			
			
		}
			System.out.println(allData);

			String filename="trainLog.txt";
			FileWriter fw=null;
			try{
			fw=new FileWriter(filename);
			fw.write(allData);
			}catch(Exception e){
				System.out.println("exception "+e.getMessage());
			}finally{
				try{
				fw.close();
				System.out.println("file saved successfully");
				}catch(Exception e){
					System.out.println("message"+e.getMessage());
				}
			}
			
	}
}