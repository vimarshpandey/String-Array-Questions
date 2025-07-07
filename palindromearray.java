public class palindromearray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 50};
        boolean flag = true;
        int j = arr.length - 1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[j]) {
                System.out.println("Not palindrome");
                flag = false;
                break;
            }
            j--;
        }
        if(flag) {
            System.out.println("Palindrome");
        }
    }
}
