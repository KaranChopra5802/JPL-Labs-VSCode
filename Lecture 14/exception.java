import java.util.Scanner;

public class exception {
    public static void main(String args[])
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter 1.Arithmetic 2.ArrayOutOfBounds 3.StringIndexOutOfBounds");
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            switch(in)
            {
                case 1:
                try
                {
                    int a,b,c;
                    a=10;
                    b=0;
                    c = a/b; 
                    System.out.println("Result :" +c);
                }
                catch (ArithmeticException e) 
                {
                    System.out.println("Can't divide a number by 0");        
                }   
                break;

                case 2:
                try
                {
                    int arr[] = new int[10];
                    arr[50] = 6;
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Array Index is Out Of Bounds Exception");
                }
                break;

                case 3:
                try
                {
                    String a = "Information Technology";
                    char c = a.charAt(50);
                    System.out.println(c);
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    System.out.println("StringIndexOutOfBoundsException Exception");
                }
                break;

                default:
                System.out.println("Invalid choice");
            } 
        }        
    }
}

