public class charactercounts {
    public static void main(String[] args) {
        String str = "aabbbccdddde";
        char[] ch = str.toCharArray();
        String result = "";

        boolean[] counted = new boolean[ch.length];

        for(int i = 0; i < ch.length; i++) {
            if(!counted[i]) {
                int count = 1;
                for(int j = i + 1; j < ch.length; j++) {
                    if(ch[i] == ch[j]) {
                        count++;
                        counted[j] = true;
                    } else {
                        break;
                    }
                }
                result = result + ch[i] + count;
            }
        }
        System.out.println("Output: " + result);
    }
}
