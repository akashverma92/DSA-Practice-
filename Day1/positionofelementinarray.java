package Day1;

import java.util.Scanner;

public class positionofelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt();
        int positon = 0;
        for(int i=0; i < arr.length; i++){
            if(ele == arr[i]){
                positon= i;
                break;
            }
        }
        System.out.println(positon);
        sc.close();
    }
    
}
