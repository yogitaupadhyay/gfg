import java.io.*;
public class StudentManagement{
	public static void main(String args[]){
		String filepath="studentDetail.txt";
		FileReader fr=null;
		LineNumberReader lnr=null;
		Student [] stu_list=new Student[10];
		try{
			fr=new FileReader(filepath);//file open
			lnr=new LineNumberReader(fr);
			String line=null;
			
			int pos=1;
			while((line=lnr.readLine())!=null){
				String [] details=line.split("::");
				if(details.length==5){
					int id=Integer.parseInt(details[0]);
					//System.out.println("id:"+id);
					String name=details[1];
					//System.out.println("name:"+name);
					int age=Integer.parseInt(details[2]);
					float height=Float.parseFloat(details[3]);
					float weight=Float.parseFloat(details[4]);
					
                 Student stu=new Student();				
				stu.setId(id);
				stu.setName(name);
				stu.setAge(age);
				stu.setHeight(height);
				stu.setWeight(weight);
				stu_list[pos-1]=stu;
				}
				pos++;
			}
			 
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
			
		}finally{
			try{
				lnr.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
		}
		
		
			 Stu_Util.showAll(stu_list);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				}
	}
}