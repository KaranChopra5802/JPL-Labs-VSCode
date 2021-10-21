import java.util.*;

class Table{
        void multiply(int i)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
}



public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        int i = sc.nextInt();
        Table table = new Table();
        table.multiply(i);
        sc.close();
    }
}
