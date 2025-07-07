public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 20, 10, 60, 90, 90};
        int max = Integer.MIN_VALUE;
        int secondLargest = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
        }
        System.out.println("Output: " + secondLargest);
    }
}
