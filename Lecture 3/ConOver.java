public class ConOver {
    public static void main(String[] args) throws Exception {

        System.out.println("The Area of circle is :");
        ConOver conOver = new ConOver(5.0);
        System.out.println("The Area of rectangle is :");
        ConOver conOver1 = new ConOver(5,10);
        System.out.println("The Area of triangle is :");
        ConOver conOver2 = new ConOver(3,4,6);

    }


    ConOver(double r)
    {
        double area = 3.14 * r * r;
        System.out.println(area);
    }

    ConOver(int l,int b)
    {
        float area = l*b;
        System.out.println(area);
    }

    ConOver(int a,int b,int c)
    {
        double s = (a+b+c)*0.5;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        System.out.println(area);
    }
}


