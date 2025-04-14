public class PrefixSumArray {
    
    // Method to build prefix sum array
    public static int[] buildPrefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Method to get sum of elements from index L to R
    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        } else {
            return prefix[R] - prefix[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        
        int[] prefix = buildPrefixSum(arr);

        // Print prefix sum array
        System.out.print("Prefix Sum Array: ");
        for (int val : prefix) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Example: Get sum from index 1 to 3 (i.e., 4 + 6 + 8 = 18)
        int sum = rangeSum(prefix, 1, 3);
        System.out.println("Sum from index 1 to 3: " + sum);
    }
}
