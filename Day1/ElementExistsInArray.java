package Day1;

import java.util.Scanner;

public class ElementExistsInArray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i<n; i++) {
        arr[i] = sc.nextInt();
    }
    int ele = sc.nextInt();
    int found = 0;for(
    int i = 0;i<arr.length;i++)
    {
        if (ele == arr[i]) {
            found++;
        }
    }if(found==1)
    {
        System.out.print("found");
    }else
    {
        System.out.print("Not found");
    }
    sc.close();
}


}
