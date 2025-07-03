import java.util.Scanner;

public class upperlowercase {

    public static void toString(char[] ch) {
        String str = new String(ch);
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }

        toString(ch);

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }

        toString(ch);

        scan.close();
    }
}
