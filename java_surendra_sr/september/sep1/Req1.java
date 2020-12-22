
  //Date  01/09/2018
 public class Req1 {

	public static void main(String args[]){
	
	int [] arr ={11,22,33,44,55,66,77,88,99,111,222,333,444};
	//System.out.println("[11,22,33,44,55,66,77,88,99,111,222,333,444]");
	
	String str="[";
	for(int e=1;e<=arr.length;e++){
	  str = str +arr[e-1];
	  if(e!=arr.length){
		str = str +",";
	  }
	}
	
  str  = str +"]";
System.out.println(str);  


StringBuffer sb=new StringBuffer("[");
	for(int e=1;e<=arr.length;e++){
	 sb.append(arr[e-1]);
	  if(e!=arr.length){
		sb.append(",");
	  }
	}
	
  sb.append("]");
System.out.println(sb.toString());  


	
	  
	}//end main

}//end class