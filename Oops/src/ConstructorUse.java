
public class ConstructorUse {
	String name;

	int age;

	public ConstructorUse(String name, int age) {
		this.name = name;
		this.age = age;        //this keyword differentiatre global and local
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		ConstructorUse e1 = new ConstructorUse("deepak", 62);    //this is parametrised constractor
		ConstructorUse e01 = new ConstructorUse("pankaj", 65);
		ConstructorUse e7 = new ConstructorUse("pritesh", 85);
		ConstructorUse e8 = new ConstructorUse("sanket", 25);

		ConstructorUse e25 = new ConstructorUse("prashant", 35);
		
	//	System.out.println(e1.name + " " + e1.age + "kk");
       
	}

}
