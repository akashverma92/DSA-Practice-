package Day1;
import java.util.*;
public class FindingLargestElement {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = Sc.nextInt();;
        int arr[] = new int[size];
        for (int i =0; i< size; i++){
            arr[i] = Sc.nextInt();

        }
        int maxi = arr[0];
        for (int i =0;i<size; i++){
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println("maxi" + maxi);
        Sc.close();
    }
    
}
