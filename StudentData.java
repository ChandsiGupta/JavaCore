class Student
{
int id;
int age;
String name;
String department;
public Student(String name)
{
this.name = name;
}
public void empAge(int age)
{
this.age = age;
}
public void departmentInfo(String department)
{
this.department = department;
}
public void printDetails()
{
System.out.println("Name is"+name);
System.out.println("Department is "+department);
System.out.println("Age is"+age);
}
}
class StudentData
{
public static void main(String[] args)
{
Student student = new Student("Ali");
Student student2 = new Student("Roy");
student.empAge(25);
student.departmentInfo("CS");
student2.empAge(29);
student2.departmentInfo("EC");
student.printDetails();
student2.printDetails();
}
}
