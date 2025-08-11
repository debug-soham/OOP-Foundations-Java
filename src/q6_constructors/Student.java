public class Student
{
    String name;
    int age;

    public Student()
    {
        name = "Soham";
        age = 18;
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;
    }

    public void display()
    {
        System.out.println("Name: " + name + " | Age: " + age);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Unknown", 18);
        s2.display();

        Student s3 = new Student(s2);
        s3.display();

    }
    
}