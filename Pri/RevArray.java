import java.util.*;

public class RevArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        print(arr);

    }

    public static void print(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void reverse(int arr[]) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
