public class maximumminimum {
    public static void main(String[] args) {
        int[] arr = {10, 50, 40, 80, 60};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: "+ max + "\nMinimum: "+ min);
    }
}
