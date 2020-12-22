import java.io.*;
import java.util.*;
public class GameGenerator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		String filename="my_game.txt";
		FileWriter fw=null;
		StringBuffer alldata=new StringBuffer();
		for(int user=0;user<10;user++){
			alldata.append("user_"+(user+1));
			for(int c=1;c<=6;c++){
				int data=rand.nextInt(6)+1;
				alldata.append("::"+data);
			}
			alldata.append(" "+"\n");
		}
		try{
		fw=new FileWriter(filename,true);
		String newline="\n";
	fw.write(newline);
		fw.write(alldata.toString());
		
		}catch(IOException e){
			System.out.println("exception : "+e.getMessage());
		}finally{
			try{
				fw.close();
				System.out.println("file saved successfully");
			}catch(Exception e){
				System.out.println("exception");
			}
		}
	}
}
