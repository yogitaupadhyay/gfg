public class SisUtil1{
	
	
	 boolean search1(String []arr,String str){
		 
		 for(int i=0;i<arr.length;i++){
					//System.out.println(arr[i]+"---"+str+"++++++++++");
			 if(arr[i]!=null&&str!=null){
				if(arr[i].equalsIgnoreCase(str)==true){
					//System.out.println(arr[i]+"---"+str+"++++++++++");
					return true;
				}
			 }
		 }
		return false; 
	 }
	 void fillArray(String []arr,String str){
		for(int i=0;i<arr.length;i++){
			 if(arr[i]==null&&str!=null){
				arr[i]=str;
				
				break;
			 }
		 }
		
	}
	 void show(String []arr){
				 System.out.println("+++++++++++++");
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]!=null){
				 System.out.println(arr[i]);
			 }
			 
		 }
				 System.out.println("+++++++++++++");
		 
	 }
}