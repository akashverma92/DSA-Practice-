package Day2;
import java.util.*;
public class AverageArray {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of first array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println("AVERAGE ");
        int avg = sum /n;
        System.out.print(avg);
        sc.close();

    }
    
}
