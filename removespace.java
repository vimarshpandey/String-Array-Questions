import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        str = str.replace(" ", "");

        System.out.println("After operation: "+str);

        scan.close();
    }
}
