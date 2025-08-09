package q3_car_encapsulation;

/*
Q3. Write a Java class to represent a car with private fields for the make, model, and year. Implement getter and setter methods for these fields and demonstrate their usage in the main method.
*/

public class Car 
{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public void display()
    {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println();
    }

    public static void main(String args[])
    {
        Car myCar = new Car("Mahindra", "XUV700", 2023);

        myCar.display();

        myCar.setMake("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2020);

        System.out.println("Updated Make: " + myCar.getMake());
        System.out.println("Updated Model: " + myCar.getModel());
        System.out.println("Updated Year: " + myCar.getYear());
        System.out.println();

        myCar.display();
    }
}