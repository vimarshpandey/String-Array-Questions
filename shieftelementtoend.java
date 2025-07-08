public class shieftelementtoend {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 0, 0, 50, 10, 30, 0, 80, 10, 90, 100, 0};
        int shiftElement = 10;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == shiftElement) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
