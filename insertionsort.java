import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before insertion sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 1; i < size; i++)
        {
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.println("After insertion sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}
