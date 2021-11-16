import java.util.Scanner;
import java.util.Vector;

public class String_Assignment
{
    
    public static void main(String args[])
    {
        Vector<String> vector = new Vector<>();         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the names :");
        for(int i=0;i<5;i++)
        {
            vector.add(sc.nextLine());
        }
        
        for(int j=0;j<4;j++)
        {
            System.out.println("Enter \n1.Delete a member \n2.Add member at specific location \n3.Add member at end of the list \n4.Print contents  ");    
            int in;
            in = sc.nextInt();
            switch(in)
            {
                case 1:
                System.out.println("Enter the position at which deletion has to take place :");
                int pos = sc.nextInt();
                vector.remove(pos-1);
                System.out.println("The vector is : " + vector);    
                break;

                case 2:
                System.out.println("Enter the position at which insertion has to take place :");
                int pos1 = sc.nextInt();
                System.out.println("Enter the element that has to be entered :");
                String input = sc.nextLine();
                vector.insertElementAt(input,pos1-1);
                System.out.println("The vector is : " + vector);
                break;

                case 3:
                System.out.println("Enter the element that has to be entered :");
                String input1 = sc.nextLine();
                vector.add(input1);
                System.out.println("The vector is : " + vector);
                break;

                case 4:
                System.out.println("The vector is : " + vector);
                break;

                default:
                System.out.println("Invalid choice !!!");
            }
        } 
    }   
}
