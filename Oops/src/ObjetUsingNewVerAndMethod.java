//using referance veriable
//public class ObjetUsingNewVerAndMethod {
//	String colour;
//	int age;
//	
//
//	public static void main(String[] args) {
//		ObjetUsingNewVerAndMethod bu = new ObjetUsingNewVerAndMethod();
//		bu.colour="pink";
//		bu.age= 12;
//		System.out.println(bu.colour+" "+bu.age);
//
//	}
//
//}
//using method
public class ObjetUsingNewVerAndMethod {
 String colour;
 int age;
 void intobj(String c, int a) {
	 colour = c;
	 age = a;
	 
 }
 void display() {
	 System.out.println(colour+" "+age);
 }
	 
	 public static void main(String [] args){
		 ObjetUsingNewVerAndMethod bu = new ObjetUsingNewVerAndMethod();
		 bu.intobj("pink", 8);
		 bu.display();
	 }
 }
	

