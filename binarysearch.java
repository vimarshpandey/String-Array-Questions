import java.util.*;

public class binarysearch {
    int binarySearch(int arr[], int high, int low, int item) {
        if(high >= low) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == item) {
                return mid;
            }

            if(arr[mid] > item) {
                return binarySearch(arr, mid - 1, low, item);
            }

            return binarySearch(arr, high, mid + 1, item);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        //int[] arr1 = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Array before sorting");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Array after sorting");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter the item you want to search");
        int item = scan.nextInt();

        binarysearch bs = new binarysearch();

        int result = bs.binarySearch(arr, size - 1, 0, item);

        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }

        scan.close();
    }
}
