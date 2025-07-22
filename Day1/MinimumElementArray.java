package Day1;
import java.util.*;
public class MinimumElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sieze of the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elemeents of the arrays");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mini= arr[0];
        for(int i=0; i <n ; i++){
            if(arr[i]< mini){
                mini = arr[i];
            }
        }
        System.out.println("Minimum element in the array is: " + mini);
        sc.close();
    }
    
}
