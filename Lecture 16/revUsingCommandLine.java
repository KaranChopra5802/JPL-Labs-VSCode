public class revUsingCommandLine
{
    public static void main(String[] args)
    {
        int rem,reverseNumber =0;
        int x = Integer.parseInt(args[0]); 
        rem=x;
        while(rem != 0)
        {
            int temp;
            temp = rem % 10;
            reverseNumber = reverseNumber * 10 + temp;
            rem = rem/10;            
        }
        System.out.println("The reversed number is:" +reverseNumber);

    }
}
