public class removespecificelement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 60, 30, 70, 30, 30, 80, 40, 10, 30};
        int removeElement = 30;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == removeElement) {
                count++;
            }
        }

        int[] nums = new int[arr.length - count];
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != removeElement) {
                nums[index] = arr[i];
                index++;
            }
        }

        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}
