interface Vehicle
{   
    void drive();
    void color();
    void seatNum(int a); //Number of seats
}

class Bicycle implements Vehicle
{    
    public void color()
    {
        System.out.println("The color is red");
    }
    public void drive()
    {
        System.out.println("The vehicle is Bicycle");
    }  
    public void seatNum(int a)
    {
        System.out.println("Number of seats are "+ a);
    }
}

class Bike implements Vehicle
{    
    public void color()
    {
        System.out.println("The color is white");
    }
    public void drive()
    {
        System.out.println("The vehicle is Bike");
    }  
    public void seatNum(int a)
    {
        System.out.println("Number of seats are "+ a);
    }
}

class Car implements Vehicle
{    
    public void color()
    {
        System.out.println("The color is blue");
    }
    public void drive()
    {
        System.out.println("The vehicle is Car");
    }  
    public void seatNum(int a)
    {
        System.out.println("Number of seats are "+ a);
    }
}

public class InterfacesExample
{
    public static void main(String args[])
    {
        Bicycle b = new Bicycle();
        b.drive();
        b.color();
        b.seatNum(1);

        Car c = new Car();
        c.drive();
        c.color();
        c.seatNum(4);

        Bike bk = new Bike();
        bk.drive();
        bk.color();
        bk.seatNum(2);
    }
}