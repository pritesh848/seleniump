package Consctactor;
//
public class Constracter1{
	String name;
	int rollno;
	public Constracter1(String name) {
		this.name= name;
		System.out.println("parametrized constructor or programmers constructor "+name);
	}
	public Constracter1() {
		this("suredh");
		this.rollno=rollno;
		
		System.out.println("this is no-argument constractor :");
	}
	public void addStudent() {
		this.rollno=rollno;
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	Constracter1 c11= new Constracter1("suredh");
	Constracter1 c12 = new Constracter1("Rakesh");
	
		System.out.println();
		
		

	}

}
