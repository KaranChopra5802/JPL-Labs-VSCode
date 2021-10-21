import java.util.*;

public class Shape
{
    public static void main(String args[])
    {
        Square s = new Square();
        System.out.println("Area of Square is : " +s.area());
        System.out.println("Perimeter of Square is : " +s.perimeter());

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle is : " +r.area());
        System.out.println("Perimeter of Rectangle is : " +r.perimeter());

        Circle c = new Circle();
        System.out.println("Area of Circle is : " +c.area());
        System.out.println("Perimeter of Circle is : " +c.perimeter());


    }
}

class Common
{    
        float length;
}

class Square extends Common
{
    double length = 5;
    double area()
    {
        return length*length;
    }
    double perimeter()
    {
        return 4*length;
    }

}

class Rectangle extends Common
{
    double length = 5;
    double breadth = 6;
    double area()
    {
        return length*breadth;
    }
    double perimeter()
    {
        return 2*(length+breadth);
    }

}

class Circle extends Common
{
    double length = 5;
    double area()
    {
        return (3.14)*length*length;
    }
    double perimeter()
    {
        return 2*(3.14)*length;
    }

}