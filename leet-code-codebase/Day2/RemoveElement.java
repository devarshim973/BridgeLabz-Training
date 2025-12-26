import java.util.Scanner;

public class RemoveElement {

    // remove element and return count k
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for elements not equal to val

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // place valid element at index k
                k++;
            }
        }

        return k; 
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Updated array (first k elements): ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
