
 public class Req {

	public static void main(String args[]){
	
	 java.util.Random rand  = new java.util.Random();
	 
	 float [][][]data =null;
	 
	 data = new float [13][4][];//dept year        stu??
	 
	 for(int dept=1;dept<=data.length;dept++){
	  for(int year=1;year<=data[dept-1].length;year++){
	    data[dept-1][year-1] = new float [rand.nextInt(4)+6];
	  }
	 }
	 
	 
	 //fill weight
 for(int dept=1;dept<=data.length;dept++){
     for(int year=1;year<=data[dept-1].length;year++){
		for(int stu=1;stu<=data[dept-1][year-1].length;stu++){
			data[dept-1][year-1][stu-1] =rand.nextInt(21)+50;
		}
	  }
   }

	 
	 for(int dept=1;dept<=data.length;dept++){
	   System.out.println("dept no " + dept);
		for(int year=1;year<=data[dept-1].length;year++){
		
			int totalStudent  = data[dept-1][year-1].length;
			System.out.println(dept +" :: year " +year +" total stu :" + totalStudent);
			for(int stu=1;stu<=totalStudent;stu++){
			   float weight  = data[dept-1][year-1][stu-1];
			   System.out.println("stu "+stu +"  weight " + weight);
			}
			System.out.println("_________________________________");
	  }
	  System.out.println("++++++++++++++++++++++++++++++++++");
	 }
	 
	 
	 
	 
	  
	}//end main

}//end class