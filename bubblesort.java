import java.util.*;

public class bubblesort
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before bubble sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort:");
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}