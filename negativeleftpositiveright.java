public class negativeleftpositiveright {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int positiveNumber = 0;
        int negativeNumber = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                negativeNumber++;
            }
        }

        positiveNumber = arr.length - negativeNumber;

        int[] posnums = new int[positiveNumber];
        int[] negnums = new int[negativeNumber];
        int pindex = 0;
        int nindex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                posnums[pindex] = arr[i];
                pindex++;
            } else {
                negnums[nindex] = arr[i];
                nindex++;
            }
        }

        int[] nums = new int[arr.length];
        int index = 0;

        for(int i = 0; i < negnums.length; i++) {
            nums[i] = negnums[i];
            index++;
        }

        for(int i = 0; i < posnums.length; i++) {
            nums[index] = posnums[i];
            index++;
        }

        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}
