import java.util.*;

class ReverseClass{
        void Rev(int i)
        {
            int temp=i,rev=0;
            while(temp!=0)
            {
                int a = temp%10;
                rev = rev*10 +a ;
                temp = temp/10;
            }
            System.out.println("Reversed Number = " +rev);
        }
}



public class Reverse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to reverse :");
        int i = sc.nextInt();
        ReverseClass reverseClass = new ReverseClass();
        reverseClass.Rev(i);
        sc.close();
    }
}
