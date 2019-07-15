package inheritance;


public class Test1 {
	public int add(int a, int b) {
		int d = a + b;
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) {

	Parent d = new Child();   // object of child is assigned to reference of parent
	// here ehile d. parents methods are showing but after running the child method is 
	//executed this is because inheritance is run time phenomena (when method is overrided),

	
	//Child cp = new Parent();
	// error : can not convert from parent to child , here Child is smaller data type 
	// than parent so jvm cant convert it , this is same as we cant save long to int 
	// directly before type casting so here also we can do type casting
	Child cp = (Child) new Parent();
	//here we can see  childs both methods after cp.

	
	
	
		System.out.println(d.eat(4, 78));
		System.out.println(cp.eat(41, 7));
	
	

		System.out.println();
	

	}

}
