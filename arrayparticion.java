public class arrayparticion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        int totalSum = 0;
        int remainingSum = 0;
        boolean flag = false;

        for(int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i];
            remainingSum = remainingSum + arr[i];
            if(remainingSum == totalSum) {
                System.out.println("Yes partition is possible");
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("Yes partition is not possible");
        }
    }
}
