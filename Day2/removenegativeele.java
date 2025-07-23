package Day2;
import java.util.*;
public class removenegativeele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        sc.close();

    }
}
