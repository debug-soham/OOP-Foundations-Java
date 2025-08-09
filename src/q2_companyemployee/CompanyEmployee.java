package q2_companyemployee;

/*
Q2. Develop a Java class to represent information about software company employees
with information like salary code ,designation,salary,department. Implement method
to display the employee details
*/

public class CompanyEmployee
{
    String name;
    String salaryCode;
    String designation;
    double salary;
    String department;

    public CompanyEmployee(String name, String salaryCode, String designation, double salary, String department)
    {
        this.name = name;
        this.salaryCode = salaryCode;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    public void display()
    {
        System.out.println("Employee Details -");
        System.out.println("Name: " + name);
        System.out.println("Salary Code: " + salaryCode);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println();
    }
    
    public static void main(String args[])
    {
        CompanyEmployee emp1 = new CompanyEmployee("Soham", "SC101", "Software Engineer", 65000, "Development");
        CompanyEmployee emp2 = new CompanyEmployee("Rohaan", "SC102", "QA Engineer", 75000, "Quality Assurance");

        emp1.display();
        emp2.display();
    }
}
