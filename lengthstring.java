import java.util.Scanner;

public class lengthstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int count = 0;
        
        // try {
        //     while(true) {
        //         str.charAt(count);
        //         count++;
        //     }
        // } catch(Exception e) {

        // }

        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            count++;
        }

        System.out.println("Length of the given string: "+count);

        scan.close();
    }
}
