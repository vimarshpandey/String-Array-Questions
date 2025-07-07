public class rotatentimes {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int timesRotate = 2;
        int n = arr.length;

        for(int t = 0; t < timesRotate; t++) {
            int last = arr[n - 1];
            for(int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
