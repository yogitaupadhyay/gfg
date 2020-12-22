public class DuplicateRemoval{
	public static void main(String args[]){
		
	SisUtil1 sisUtil1=new SisUtil1(); 
	String [] StudentList={"nishtha","vaishali",
				"varsha","tapsaya","komal","kajal",
				"nishatha","nishtha","vaishali","varsha"};
	String resultedArray[]=new String[StudentList.length];
	for(int i=1;i<=StudentList.length;i++){
		//System.out.println(StudentList[i-1]+"++++++++++++++");
	boolean ispresent=sisUtil1.search1(resultedArray,StudentList[i-1]);
	//System.out.println(ispresent+"::::::::::::"+StudentList[i-1]);
	if(ispresent==false){
		sisUtil1.fillArray(resultedArray,StudentList[i-1]);
		
	}
	}
		sisUtil1.show(resultedArray);
		
	}
	
	
}