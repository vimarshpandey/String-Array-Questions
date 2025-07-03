import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = false;
        System.out.println("Enter the element you want to search: ");
        int element = scan.nextInt();

        int arr[] = {50, 30, 90, 40, 60, 10};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                flag = true;
                System.out.println("Element found at index "+i+".");
                break;
            }
        }

        if(flag == false) {
            System.out.println("Element not found.");
        }

        scan.close();
    }
}
