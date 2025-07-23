package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class uniqueelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for (int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int temp[] = new int[n];
        int j =0;
        for(int i = 0; i< n-1 ; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
            
        }
        temp[j++] = arr[n-1];
        for(int i=0; i<j;i++){
            System.out.print(temp[i]+" ");
        }
        sc.close();
    }
}
