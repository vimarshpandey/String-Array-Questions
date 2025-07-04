import java.util.Scanner;

public class firstnonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        String str =s.toLowerCase();
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            int count = 1;
            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("Output: " + ch[i]);
                break;
            }
        }

        scan.close();
    }
}
