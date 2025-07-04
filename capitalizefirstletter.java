import java.util.Scanner;

public class capitalizefirstletter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "my name is vimarsh pandey";
        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++) {
            String string1 = str[i].substring(0, 1).toUpperCase();
            String string2 = str[i].substring(1).toLowerCase();
            System.out.print(string1 + string2 + " ");
        }

        scan.close();
    }
}
