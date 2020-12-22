import java.io.*;
public class CharReaderByBufferedReader{
	public static void main(String args[]){
		String filepath="info1.txt";
		FileReader fr=null;
		BufferedReader br=null;
		try{
			fr=new FileReader(filepath);
			br=new BufferedReader(fr);
			int data;
			long start =System.currentTimeMillis();
			while((data=br.read())!=-1){
			//System.out.print((char)data);
				}
			long end=System.currentTimeMillis();
			System.out.println("total time taken :"+(end-start));
			 
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception 1:"+e.getMessage());
			
		}finally{
			if(fr!=null){
			try{
				
				br.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
			}
		}
	}
}