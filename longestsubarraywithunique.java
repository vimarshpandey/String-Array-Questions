public class longestsubarraywithunique {
    public static void main(String[] args) {
        try {
            int[] arr = { 10, 20, 30, 40, 10, 20, 30, 50, 60, };
            int i = 0, j = 1;
            while (i < arr.length && j < arr.length) {
                if (arr[i] == arr[j]) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }

            for (int k = i; k <= j; k++) {
                System.out.print(arr[k] + " ");
            }
        } catch (Exception e) {

        }
    }
}
