import java.util.Scanner;

public class onlydigitstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        boolean flag = true;

        for(int i = 0; i < ch.length; i++) {
            if(!Character.isDigit(ch[i])) {
                flag = false;
                break;
            }
        }

        if(flag == true) {
            System.out.println("String contains only digit");
        } else {
            System.out.println("String contains not only digit");
        }
        
        scan.close();
    }
}
