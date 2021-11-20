import java.util.ArrayList;
import java.util.Scanner;

public class revUsingArrayList
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> revarrayList = new ArrayList<Integer>();

        System.out.println("Enter the numbers :");

        for(int i=0;i<5;i++)
        {
            arrayList.add(sc.nextInt());
        }

        System.out.println("The array list is : "+arrayList);

        for(int i = arrayList.size()-1;i>=0;i--)
        {
            revarrayList.add(arrayList.get(i));
        }
        
        System.out.println("The reversed array list is : "+ revarrayList);
    }
}
