public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int missing = 0;
        boolean flag = false;

        for(int i = arr[0]; i < arr.length - 1; i++) {
            if(arr[i] + 1 != arr[i + 1]) {
                missing = arr[i] + 1;
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("No missing number is there in the given series");
        } else {
            System.out.println("Missing number is: " + missing);
        }
    }
}
