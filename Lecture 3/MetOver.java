class MethodOverloading
{
    void Area (double r)
    {
        double area = 3.14 * r * r;
        System.out.println(area);
    }

    void Area(int l,int b)
    {
        float area = l*b;
        System.out.println(area);
    }

    void Area(int a,int b,int c)
    {
        double s = (a+b+c)*0.5;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println(area);
    }
}


public class MetOver {
    public static void main(String[] args) throws Exception {

        MethodOverloading method = new MethodOverloading();
        System.out.println("The Area of circle is :");
        method.Area(5);
        System.out.println("The Area of rectangle is :");
        method.Area(5,10);
        System.out.println("The Area of triangle is :");
        method.Area(3,4,6);

    }
}


