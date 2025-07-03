import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before selection sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < size; i++) {
            int smallest = i;
            for(int j = i + 1; j < size; j++) {
                if(arr[smallest] > arr[j]) {
                    int temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After selection sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}
