package Day3;

import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }

        System.out.println("Duplicate elements are:");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
