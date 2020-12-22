
  //Date  01/10/2018
 public class Demo1 {

	public static void main(String args[]){
	
	 TextBook  book1  = new TextBook();
	 System.out.println(book1);
	 book1.name ="java";
	 book1.price=500;
	 book1.authorName="sk";
	 
	 String [] pageList  = new String[5];
	 pageList[0]="java is PI";
	 pageList[1]="java is OOP";
	 pageList[2]="java is Robust";
	 pageList[3]="java is Secure";
	 pageList[4]="java is Multithreaded";
	 
	 book1.pages= pageList;
	 
	 book1.about();
	 
	 
	 book1.next();//1
	 book1.next();//2
	 book1.next();//3
	 book1.next();//4
	 book1.next();//5
	 System.out.println("********************************");
	 book1.next();//in last page
	 book1.next();//in last page
	 System.out.println("********************************");
	 book1.prev();//4
	 
	 book1.prev();//3
	 book1.prev();//2
	 book1.prev();//1
	 
	 book1.prev();//1
	 book1.prev();//1
	 
	 
	 
	 
	  
	}//end main

}//end class