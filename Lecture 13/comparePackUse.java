import java.util.Scanner;

import MyPackage.*;

public class comparePackUse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        Compare compare = new Compare(a, b);
        compare.getmax();
    }
}
