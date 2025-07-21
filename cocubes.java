public class cocubes {
    public static void main(String[] args) {
        String input = "natiaaaiiiiiooooonqqqqttttrrrrbbbmmma";
        String str = "";
        String result = "";
        String ans = "";

        char[] ch = input.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                str += "V";
            } else {
                str += "C";
            }
        }

        char[] c = str.toCharArray();

        for(int i = 1; i < c.length; i++) {
            if(c[c.length - i] == c[c.length - i - 1]) {
                continue;
            } else {
                result += c[c.length - i];
            }
        }

        if(c[0] == 'a' || c[0] == 'e' || c[0] == 'e' || c[0] == 'i' || c[0] == 'o' || c[0] == 'u') {
            result += "V";
        } else {
            result += "C";
        }
        
        char[] cha = result.toCharArray();

        for(int i = cha.length - 1; i >= 0; i--) {
            ans = ans + cha[i];
        }

        System.out.println(ans);
    }
}
