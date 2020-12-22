public class Student{
	private String name;
	private int id;
	private int age;
	private float  weight;
	private float height;
	//setter
	void setName(String name){
		this.name=name;
	}
	void setId(int id){
		this.id=id;
	}
	void setAge(int age){
		this.age=age;	
	}
	void setWeight(float weight){
		this.weight=weight;
	}
	void setHeight(float height){
		this.height=height;
	}
	
	//getter
	String getName(){
		return name;
	}
	int getId(){
		return id;
	}
	int getAge(){
		return age;
	}
   float getWeight(){
	return weight;
   }
	float getHeight(){
		return height;
	}
}