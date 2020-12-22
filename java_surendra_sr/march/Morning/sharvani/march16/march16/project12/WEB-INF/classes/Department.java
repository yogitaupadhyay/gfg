 
 public class Department{ 
   private long id;
   private String name;
   private String location;
   
     public Department(){}
     public Department(long id, String name ,String location){
	  this.id=id;
	  this.name=name;
	  this.location=location;
	 }
   
   public void setId(long id){this.id=id;}
   public long getId(){ return id;}
   public String getName(){ return name;}
   public void setName(String name){
		this.name=  name;
   }
   public String getLocation(){ return location;}
    public void setLocation(String location){
		this.location=  location;
   }
   
 }//End of class 
