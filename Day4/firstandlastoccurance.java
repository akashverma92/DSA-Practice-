package Day4;
import java.util.*;
public class firstandlastoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element : ");
        int k = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            if(arr[i] == k){
                System.out.println("The first occurance of element is at index : " + i);
                break;
            }
        }
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(arr[i] == k){
                System.out.println("The last occurance of element is at index : " + i);
                break;
            }
        }
        sc.close();
    }
}
