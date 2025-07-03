public class removevowels {
    public static void main(String[] args) {
        String str1 = "Vimarsh Pandey";
        String str = str1.toLowerCase();
        char ch[] = str.toCharArray();
        String result = "";

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
                result += ch[i];
            }
        }

        //String s = new String(ch);
        System.out.println("Output: " + result);
    }
}
