public class highandlowelements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int[] nums = new int[n];

        int start = 0;
        int end = n - 1;
        boolean pickHigh = true;

        for(int i = 0; i < n; i++) {
            if(pickHigh) {
                nums[i] = arr[end];
                end--;
            } else {
                nums[i] = arr[start];
                start++;
            }
            pickHigh = !pickHigh;
        }

        for(int nu : nums) {
            System.err.print(nu + " ");
        }
    }
}
