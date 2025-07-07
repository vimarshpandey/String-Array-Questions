public class duplicateinarray {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 20, 10, 60, 90, 90};
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
