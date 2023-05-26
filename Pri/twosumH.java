import java.util.*;

public class twosumH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the target element");
        int target = scn.nextInt();
        int ans[] = hashm(arr, target);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] hashm(int arr[], int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]) && i != map.get(target - arr[i])) {
                ans[0] = i;
                ans[1] = map.get(target - arr[i]);
            }
        }
        return ans;
    }

}
