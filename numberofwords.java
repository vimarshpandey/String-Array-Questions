import java.util.Scanner;

public class numberofwords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        String[] string = str.split(" ");
        int count = 0;

        for(int i = 0; i < string.length; i++) {
            count++;
        }

        System.out.println("Number of words: " + count);

        scan.close();
    }
}
