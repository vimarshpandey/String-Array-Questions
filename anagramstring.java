import java.util.*;

class anagramstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scan.nextLine();
        
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        
        for(int i = 0; i < ch1.length; i++) {
            for(int j = 0; j < ch1.length - i - 1; j++) {
                if(ch1[j] > ch1[j + 1]) {
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;
                }
            }
        }
        
        for(int i = 0; i < ch2.length; i++) {
            for(int j = 0; j < ch2.length - i - 1; j++) {
                if(ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
                }
            }
        }
        
        int flag = 0;
        if(ch1.length == ch2.length) {
            for(int i = 0; i < ch1.length; i++) {
                if(ch1[i] == ch2[i]) {
                    flag = 1;
                    continue;
                } else {
                    flag = 0;
                    break;
                }
            }
        } else {
            System.out.println("Strings are not anagram.");
        }
        
        if(flag == 0) {
            System.out.println("Strings are not anagram.");
        } else {
            System.out.println("Strings are anagram.");
        }
        
        scan.close();
    }
}