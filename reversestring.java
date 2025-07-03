import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("Before reversing: "+str);

        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("After reversing: "+reversed);

        scan.close();
    }
}
