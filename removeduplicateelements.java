import java.util.Arrays;

public class removeduplicateelements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 10, 60, 90, 90, 10, 50};
        int[] nums = new int[arr.length];
        Arrays.sort(arr);
        int index = 0;

        nums[index] = arr[0];
        index++;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                nums[index] = arr[i];
                index++;
            }
        }

        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}
