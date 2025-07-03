import java.util.*;

class findingduplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = scan.nextLine();

        scan.close();
        
        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            for(int j = 0; j < ch.length - i - 1; j++) {
                if(ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        
        try {
            for(int i = 0; i < ch.length; i++) {
                if(ch[i] != ch[i + 1]) {
                    continue;
                } else {
                    System.out.println(ch[i]);
                }
            }
        } catch(Exception e) {
            
        }
    }
}
