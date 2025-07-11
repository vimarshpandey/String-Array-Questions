public class slidingwindowarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int max = 0;

        for(int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for(int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }
            System.out.print(sum + " ");
            if(max < sum) {
                max = sum;
            }
        }
        System.out.println("\nMaximun sum is: " + max);
    }
}
