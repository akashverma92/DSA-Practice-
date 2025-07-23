package Day2;

import java.util.*;

public class Additionarray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] =sc.nextInt();
        }
        System.out.println("Enter the elements of array: ");
        int arr2[] = new int[n2];
        for (int i= 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        int temp[] =new int[n1];
        for(int i=0; i< n1;i++){
            temp[i] = arr1[i]+arr2[i];
        }
        for(int i =0 ; i<n1 ; i++){
            System.out.print(temp[i]);
        }
        sc.close(); 
    }
    
    
}
