package Consctactor;


public class Student {
    String sname="";
    String rollNo;
    //This is parameterized constructor
    public Student(String name) {
        System.out.println("This is parameterized constructor");
    }
    
    //This is No-argument Constructor
    public Student() {
        this("suresh");
        System.out.println("This is No-argument constructor");
        
    }
    public Student (int a, int b){
    	int y = a+b;
    	System.out.println(y);
    }
    //This is instance method
    public void addStudent(String rollNo) {
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Student c11 = new Student("Suresh");
        Student c12=new Student("Pankaj");
        Student p11=new Student();
        //System.out.println("Student name: "+c11.sname);
        Student c111 = new Student(5,8);
        
        
    }

}