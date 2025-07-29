package Day5;

import java.util.Scanner;

public class squarerootinarrayusingbinarsearch {
    public static int sqrt(int arr[] , int target){
        int left = 0 ;
        int right = arr.length -1;
        int result = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return arr[mid];
            }else if (arr[mid] < target){
                left = mid +1;
            }else if(arr[mid] > target){
                right = mid -1;
            }
        }
        return result -1;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int arr[] = new int[n];
        for (int i =0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = sqrt(arr,target);
        double squreroot = Math.sqrt(result);

        System.out.println("The sqrt of "+target+"is "+squreroot);
        sc.close();

    }

    
}
