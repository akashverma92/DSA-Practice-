package Day2;
import java.util.*;
public class RotateRight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr[] = new int[n1];
        for(int i=0; i<n1; i++){
            arr[i] =sc.nextInt();
        }
        int res=arr[n1-1];
        for( int i=n1-1; i>0 ; i--){
            arr[i] = arr[i-1];
            
        }
        arr[0] = res;
        for(int i=0; i<n1;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
