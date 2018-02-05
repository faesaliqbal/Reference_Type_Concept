package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reference Types
		 * A reference type stores a reference (or address) to the memory location where the corresponding data is stored.
		 * When you create an object using the constructor, you create a reference variable.
		 * 
		 */
		
		Person j;
		j = new Person("faisal");
		j.setAge(30);
		
		celebrateBirthday(j);
		System.out.println(j.getAge());
		/*
		 * method celebrateBirthday() takes a person object as its parameter, and increments its attribute.
		 * Because j is a reference type, the method affects the object itself, and is able to change the actual value of its attribute.
		 * 
		 * ARRAYS AND Strings are also referEnce data types.
		 */
	}
	
	static void celebrateBirthday(Person p){
		p.setAge( p.getAge() + 1 );
	}
}
