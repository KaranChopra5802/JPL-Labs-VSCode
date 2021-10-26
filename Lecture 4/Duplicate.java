import java.util.*;

public class Duplicate{
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of array: ");
        int n = sc.nextInt();
        int a=0,flag,count=0;
        int [] arr = new int[n];
        int [] temp = new int[n];
        System.out.println("Enter elements :");

        for(i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(i = 0; i < n ; i++){
            flag=0;
            for(int j = i + 1; j < n; j++){
                if(arr[i] != arr[j]){                   
                    flag++;                  
                }
            }

            if(flag==(arr.length-i-1))
            {
                temp[a]=arr[i];
                a++;  
                count++;
            }
        }

        System.out.println("The modified Array is :");
        
        for(i = 0; i < count; i++)
        {
            System.out.print(temp[i] + " ");
        }


        }
        
}
