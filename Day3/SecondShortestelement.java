package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class SecondShortestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The second shortest element in array is : " + arr[1]);
        sc.close();
    }
    
}
