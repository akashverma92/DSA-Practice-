package Day3;

import java.util.Scanner;

public class evenoddelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];

        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int even[] = new int[n];
        int odd[] = new int[n];
        int j=0;
        int k =0;
        for(int i = 0; i<n;i++ ){
            if(arr[i]%2 ==0){
                even[j++] = arr[i];
            }
            else{
                odd[k++] = arr[i];
            }
        }
        System.out.print("Even Numbers in array : ");
        for(int i =0 ; i< j ; i++){
            System.out.print(even[i]);
        }
        System.out.println();
        System.out.print("Odd Numbers in array: ");
        for(int i = 0; i<k; i++){
            System.out.print(odd[i]);
        }
        sc.close();
    }
}
