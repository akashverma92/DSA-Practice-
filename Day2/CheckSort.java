//Code for checking if an array is sorted
package Day2;
import java.util.*;

public class CheckSort {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr1[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] =sc.nextInt();
        }
        int greater=0;
        for(int i=0; i<n1-1 ; i++){
            if(arr1[i] > arr1[i+1]){
                greater++;
            }
        }
        if(greater>0){
            System.out.println("not sorted");
        }else{
            System.out.println("Sorted");
        }
        sc.close();
        
 
    }
    
}
