
 public class Demo2 {

	public static void main(String args[]){
	
 
	System.out.println("+++++++++++++++++++++++++");
    //int [][]arr2 = new int[2][25];
    float [] []batchWiseStuWeight = null;
	System.out.println(batchWiseStuWeight);
	//System.out.println(batchWiseStuWeight[0]);
               //System.out.println(batchWiseStuWeight[1]);
	
	batchWiseStuWeight=new float [2][];
	System.out.println(batchWiseStuWeight);
	
	System.out.println("batch1 "+batchWiseStuWeight[0]);
	System.out.println("batch2 "+batchWiseStuWeight[1]);

	System.out.println("++++++++++++++++++++++++++++++");
	//batch 1
	  batchWiseStuWeight[0] = new float[25];
	System.out.println("batch1 "+batchWiseStuWeight[0]);
	System.out.println("batch2 "+batchWiseStuWeight[1]);

	System.out.println("++++++++++++++++++++++++++++++");
	//batch2
	/*
	float [] a1  =  new float[27];  batchWiseStuWeight[1] =a1;*/
    batchWiseStuWeight[1] = new float[27];
	System.out.println("batch1 "+batchWiseStuWeight[0]);
	System.out.println("batch2 "+batchWiseStuWeight[1]);

	
	System.out.println("__________________");
	System.out.println("top" + batchWiseStuWeight);
	System.out.println("total batch " + batchWiseStuWeight.length);
	
	System.out.println("batch1 " + batchWiseStuWeight[0]);
	System.out.println("batch1 total student " + batchWiseStuWeight[0].length);

	System.out.println("batch2 " + batchWiseStuWeight[1]);
	System.out.println("batch2 total student " + batchWiseStuWeight[1].length);

	
	System.out.println("++++++++++++++++++++++++++++++++++++++");
	
	for(int batch=1;batch<=batchWiseStuWeight.length;batch++){
	   System.out.print("batch#" +batch);
	   
	   float [] temp = batchWiseStuWeight[batch-1];
	   System.out.println(" has total student " +temp.length);
	   
	      for(int stu=1;stu<=batchWiseStuWeight[batch-1].length;stu++){
		    float weight  = batchWiseStuWeight[batch-1][stu-1];
		     System.out.println("batch"+batch +"\'s stu#" +stu  +" weight : " + weight);
		  }
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");	
	}
	
	
	System.out.println("+++++++++++++++++++++");
	
		for(int batch=1;batch<=batchWiseStuWeight.length;batch++){
	      for(int stu=1;stu<=batchWiseStuWeight[batch-1].length;stu++){
		    float weight  = batchWiseStuWeight[batch-1][stu-1];
		     System.out.print( weight +" ");
		  }
      System.out.println();	
	}
	
	
	}//end main

}//end class