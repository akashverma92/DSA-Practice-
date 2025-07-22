package Day1;
import java.util.*;
public class evenandodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i< n ; i++){
            arr[i] = sc . nextInt();
        }
        int even = 0;
        int odd =0;
        System.out.print("Even numbers are : ");
        for (int i =0; i < n ; i++){
            if(arr[i] %2 == 0){
                System.out.print( arr[i]);
                even++;
            }
        }
        System.out.println();
        System.out.print("Odd numbers are : ");
        for(int i =0; i<n ; i++){
            if(arr[i] %2 !=0){
                System.out.print(arr[i]);
                odd++;

            }
        }
        System.out.println();
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);

        sc.close();

    }
}
