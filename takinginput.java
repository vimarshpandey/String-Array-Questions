import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter a number at " + i + " index: ");
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.println("Element at " + i + " index is: " + arr[i]);
        }
        
        scan.close();
    }
}
