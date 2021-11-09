package MyPackage;

public class Compare 
{
    int a,b;
 
    public Compare(int n, int m)
    {
        a = n;
        b =m;    
    }
    
    public void getmax()
    {
        if ( a > b ) 
        {
            System.out.println("First number is greater");
        }
        else
        {
            System.out.println("Second Number is greater");
        }
    }
}