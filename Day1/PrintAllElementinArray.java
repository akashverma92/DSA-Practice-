package Day1;
import java.util.*;
public class PrintAllElementinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
    
        System.out.println("Enter The elements of the array :");
        int arr[] = new int[size];
        for (int i =0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}