import java.util.Scanner;

public class removerspacewithhyphen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "My name is Vimarsh Pandey";
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                ch[i] = '-';
            }
        }

        String s = new String(ch);
        System.out.println("New string: " + s);

        scan.close();
    }
}
