package Day4;
import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element of arrays: ");
        int arr[] = new int[n];
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int neg[] = new int[n];
        int pos[] = new int[n];
        int j = 0 , k =0;
        for (int i =0; i<n ; i++){
            if (arr[i] < 0){
                neg[j++] = arr[i];
            }else{
                pos[k++] = arr[i];
            }
        }
        for (int i =0 ; i< k; i++){
            System.out.print(pos[i] );
        }
        for (int i =0 ; i< j; i++){
            System.out.print(neg[i]);
        }
        
        int merge[] = new int[n];
        for (int i = 0 ;i < j; i++){
            merge[i] = neg[i];
        }
        for (int i =0 ; i<k; i++){
            merge[j +  i ] = pos[i];
        }
        System.out.println();
        for (int i =0 ; i< merge.length; i++){
            System.out.print(merge[i] + " ");
        }
    }
}

