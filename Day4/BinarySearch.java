package Day4;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        System.out.println("Enter the element to search: ");
        int k = sc.nextInt();
        int found = 0;
        for (int i = 0 ; i<n; i++){
            int mid = left +(right-left)/2;
            if(arr[mid] == k){
                System.out.println("the element found at index: " + i);
                found ++;
                break ;
            }else if(arr[mid] < k){
                left = mid + 1;
            }else if (arr[mid] > k){
                right = mid - 1;
            }
        }
        if (found == 0) {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}
