public class frequencyofelements {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 20, 10, 60, 90, 90, 90};
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
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
