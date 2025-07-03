import java.util.Scanner;

public class countvowelconst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        str = str.toLowerCase();

        int countVowel = 0, countConst = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowel++;
            } else {
                countConst++;
            }
        }

        System.out.println("Number of vowels: "+countVowel+" \nNumber of consonents: "+countConst);

        scan.close();
    }
}
