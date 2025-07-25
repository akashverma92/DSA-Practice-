package Day4;

import java.util.*;

public class medianofsortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        Arrays.sort(merged);
        int total = n1 + n2;
        int mid = total / 2;
        if (total % 2 != 0) {
            System.out.println( merged[mid]);
        } else {
            System.out.println( (merged[mid - 1] + merged[mid]) / 2.0);
        }
        sc.close();
    }
}
