public class test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(count == 3) {
                System.out.println(arr[i]);
                count++;
            }
        }
    }
}