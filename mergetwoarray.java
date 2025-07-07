public class mergetwoarray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50};
        int n = arr1.length + arr2.length;
        int[] merged = new int[n];
        int index = 0;

        for(int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
            index++;
        }

        for(int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        for(int m : merged) {
            System.out.print(m + " ");
        }
    }
}
