package Day4;
import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   
        System.out.println("Enter the element to search: ");
        int k = sc.nextInt();
        int found = 0;
        for (int i =0; i< n ; i++){
            if (arr[i] == k){
                System.out.println("Element found at index: " + i);
                found ++;
                break;
            }
        }
        if (found == 0) {
            System.out.println("Element not found in the array.");
        }
        sc.close();

    }
}
