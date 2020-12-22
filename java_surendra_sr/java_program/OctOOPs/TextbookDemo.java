public class TextbookDemo{
	public static void main(String args[]){
System.out.println("which operation do u want to perform");
System.out.println("1:details ");
System.out.println("2:first page open ");
System.out.println("3:last page open");
System.out.println("4: next page  ");
System.out.println("5:prev page ");
System.out.println("6:exit ");
java.util.Scanner scan =new java.util.Scanner(System.in);

Textbook textbook=new Textbook();
textbook.name="harry potter";
textbook.authorName="j.k. rowling";
textbook.price=750.0f;

String [] pagematter=new String[5];
pagematter[0]="java is plateform independent";
pagematter[1]="java is robust";
pagematter[2]="java id strict";
pagematter[3]="java is secure";
pagematter[4]="java is multithreaded";

textbook.pages=pagematter;
 textbook.currentPage=1;
 while(true){ 
 int option=scan.nextInt();
switch(option){
	case 1:
	textbook.about();
	break;
	
	case 2:
	textbook.first();
	break;
	
	case 3:
	textbook.last();
	break;
	
	case 4:
	textbook.next();
  
	break;
	
	case 5:
	textbook.prev();
	break;
	
	case 6:
	System.exit(0);
	break;
	
	default:
	System.out.println("no valid option choosen");
	break;

}
	}


		
		
	}
}