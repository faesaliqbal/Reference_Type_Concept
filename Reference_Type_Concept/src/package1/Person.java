package package1;

public class Person {
	private String name;
	private int age;
	
	Person(String str){
		name = str;
	}
	
	public void setAge(int value){
		this.age = value;
	}
	
	public int getAge(){
		return age;
	}

}
