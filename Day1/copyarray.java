package Day1;
import java.util.*;
public class copyarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[n];
        for (int i =0 ; i< n ; i++){
            arr[i] = sc .nextInt();
        }
        int copy[] = new int[arr.length];
        for(int i =0 ; i < arr.length ; i++){
            copy[i] = arr[i];

        }
        System.out.print("Original Elements ");
        for(int i = 0; i< n; i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();
        System.out.print("COpied Elements ");
        for (int i = 0; i < copy.length; i++){
            System.out.print(" " + copy[i]);
        }
        sc.close();
    }
}