package Day3;

import java.util.*;

public class mergetwosortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        System.out.println("Enter the elements of the arrays 2: ");
        int arr[] = new int[n];
        int arr2[] = new int[n2];
        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        int merge[] = new int[n + n2];
        for(int i=0; i<n ;i++){
            merge[i]=arr[i];
        }
        for(int i= 0 ; i < n2; i++){
            merge[n + i] = arr2[i];
        }
        Arrays.sort(merge);
        for(int i=0; i<merge.length; i++){
            System.out.print(merge[i]);
        }
        sc.close();
    }
}
