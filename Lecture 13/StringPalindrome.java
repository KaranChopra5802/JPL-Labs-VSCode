import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[])
    {
        String str,revstr="";
        int len,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        str = sc.nextLine();

        len = str.length();
        for(i=len-1;i>=0;i--)
        {
            char a = str.charAt(i);
            revstr = revstr + a;
        }

        if(revstr.equals(str))
        {
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("The string is not Palindrome");
        }

    }
}
