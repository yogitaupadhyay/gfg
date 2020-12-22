public class Student{
 int id;
String name;
int age;
String gender;
String branch;
String college;
int sem;
 Student(int id,String name,int age,String gender,String branch,String colege,int sem){
	this.id= id;
this.name=name;
this.age=age;
this.gender=gender;
this.branch=branch;
this.college=college;
this.sem=sem; 
 }
@Override
 
 
  //public java.lang.String toString()
 
public java.lang.String toString(){
	 return "id-"+id +" gender-"+ gender+"  branch-"+branch +"  college-"+college;
	 
 } 
	
	
	
	
}