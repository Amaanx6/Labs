// 1.	a) Write a Java sample program to implement class and object concepts.
class Student {

String name;
int age;
String grade;

 public void displayStudentInfo() {
System.out.println("Student Name: " + name); 
System.out.println("Student Age: " + age); 
System.out.println("Student Grade: " + grade);
}
}


public class Main {
public static void main(String[] args) {

Student student1 = new Student();


student1.name = "Alice";
student1.age = 20; 
student1.grade = "A";


student1.displayStudentInfo();

Student student2 = new Student();
student2.name = "Bob"; 
student2.age = 22; 
student2.grade = "B";
 
student2.displayStudentInfo();
}
}
