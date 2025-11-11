// 1.	b) Write a Java program to illustrate types of constructors.
class Student {
String name;
int age;
String grade;

public Student(String name, int age, String grade) {
this.name = name;
this.age = age;
this.grade = grade;
}

public void displayStudentInfo() {
System.out.println("Student Name: " + name);
System.out.println("Student Age: " + age);
System.out.println("Student Grade: " + grade);
}
}

public class Main1 {
public static void main(String[] args) {

Student student1 = new Student("Alice", 20, "A");
Student student2 = new Student("Bob", 22, "B");

student1.displayStudentInfo();
student2.displayStudentInfo();
}
}
