package Day2;

import java.util.Scanner;

public class ElementsGreaterthankthElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the kth elements ");
        int a = sc.nextInt();
        int temp[]= new int[n];
        int j=0;
        for(int i=0; i<n;i++){
            if(a < arr[i]){
                temp[j++]=arr[i];
            }
        }
        for(int i=0; i<j; i++){
            System.out.print(temp[i]);
        }
        sc.close();
        


    }
}
