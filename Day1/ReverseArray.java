package Day1;


import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1; i >=0; i--){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
