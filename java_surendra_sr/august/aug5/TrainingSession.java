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
 */

  //Date  05/08/2018
 public class TrainingSession {

	public static void main(String args[]){
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		String roomOpen;
		String trainerAvailable;
		String studentAvailable;
	 System.out.println("is room open  ?? yes or no");
	 roomOpen = scan.nextLine();
	 
	 System.out.println("is trainer available ?? yes or no");
	 trainerAvailable = scan.nextLine();
	 System.out.println("are student available ?? yes or no");
	 studentAvailable = scan.nextLine();
	 
	 System.out.println("way1");
	 
	  if("yes".equalsIgnoreCase(roomOpen)){//c1
	          if("yes".equalsIgnoreCase(trainerAvailable) ){  //c2
						if("yes".equalsIgnoreCase(studentAvailable)){ //c3
						    System.out.println("Successfuly session completed.");
						}//c3
		    }//c2				
	  }//c1
	 
	  System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
	 
	 System.out.println("way2");
	 if("yes".equalsIgnoreCase(roomOpen)){//c1
	  
	          if("yes".equalsIgnoreCase(trainerAvailable) ){  //c2
			  
						if("yes".equalsIgnoreCase(studentAvailable)){ //c3
						    System.out.println("Successfuly session completed.");
						}else{//
						System.out.println("session not done becuase  students  were not available");
						}//end of c3
			  }else{
					System.out.println("session not done becuase  trainer  was not available");
			  }//end of c2
			  
	  }else{
	     System.out.println("session not done becuase  room was not opend");
	  }//end of c1
	  
	  
	  
	  System.out.println("__________________________________________");
	  
	   System.out.println("way3");
	 boolean sessionSuccess =false;
	 
	  if("yes".equalsIgnoreCase(roomOpen)){//c1
	          if("yes".equalsIgnoreCase(trainerAvailable) ){  //c2
						if("yes".equalsIgnoreCase(studentAvailable)){ //c3
						 sessionSuccess =true;
						}//c3
		    }//c2				
	  }//c1
	  
	   System.out.println("session success or not  " + sessionSuccess);
	   
	  System.out.println("____________________________________________"); 
	      
	      System.out.println("way4");
	 
	  if("yes".equalsIgnoreCase(roomOpen)
	    &&"yes".equalsIgnoreCase(trainerAvailable)
		&&"yes".equalsIgnoreCase(studentAvailable)){
		
	      System.out.println("session success ");
	  }else{
	   System.out.println("session NOT success");
	  
	  }
	  
	   
	   
	   
	}//end main

}//end class