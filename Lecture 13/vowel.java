import java.util.Scanner;

public class vowel {
    public static void main(String args[])
    {
        String str;
        int count=0,len,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        str = sc.nextLine();
        len = str.length();
        for(i = 0;i<len;i++)
        {
            char a = str.charAt(i);
            if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A' ||a=='E' ||a=='I' ||a=='O' ||a=='U')
            {
                count++;
            }
        }
        System.out.println("The number of vowels in the sentence is : " + count);
    }
}
