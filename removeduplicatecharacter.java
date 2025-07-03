public class removeduplicatecharacter {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str = str1.toLowerCase();
        char[] ch = str.toCharArray();
        String result = "";

        for(int i = 0; i < ch.length; i++) {
            if(result.indexOf(ch[i]) == -1) {
                result += ch[i];
            }
        }

        System.out.println("Output: " + result);
    }
}
