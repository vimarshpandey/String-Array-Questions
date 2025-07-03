public class swapcase {
    public static void main(String[] args) {
        String str = "ViMarsH";
        char[] ch = str.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            } else {
                ch[i] = (char) (ch[i] + 32);
            }
        }

        String s = new String(ch);
        System.out.println("Output: " + s);
    }
}
