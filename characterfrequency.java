import java.util.Scanner;

public class characterfrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = "Programmmingp";
        String str = str1.toLowerCase();
        char[] ch = str.toCharArray();

        boolean[] counted = new boolean[ch.length];

        for(int i = 0; i < ch.length; i++) {
            if(!counted[i]) {
                int count = 1;
                for(int j = i + 1; j < ch.length; j++) {
                    if(ch[i] == ch[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(ch[i] + " : " + count);
            }
        }

        scan.close();
    }
}
