public class finduniqueelements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 60, 10, 50, 60, 70, 100, 100, 80};
        boolean[] counted = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(!counted[i]) {
                int count = 1;
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                if(count == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
