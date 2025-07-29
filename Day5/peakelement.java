package Day5;

import java.util.Scanner;

public class peakelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int j = 0;

        if (n == 1 || arr[0] > arr[1]) {
            result[j++] = arr[0];
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                result[j++] = arr[i];
            }
        }
        if (n > 1 && arr[n - 1] > arr[n - 2]) {
            result[j++] = arr[n - 1];
        }
        if (j == 0) {
            System.out.println("No peak elements found.");
        } else {
            System.out.println("Peak elements are:");
            for (int i = 0; i < j; i++) {
                System.out.println(result[i]);
            }
        }
        sc.close();
    }
}
