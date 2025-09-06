public class longestpalindromicsubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbd"));
    }

    public static boolean isPlaindrome(int s, int e, char arr[]) {
        while(s < e) {
            if(arr[s] != arr[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    
    public static String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int max = 0;

        int start = 0;
        int end = 0;
        int resstart = 0;
        int resend = 1;

        for(int i = 0; i < ch.length; i++) {
            for(int j = i; j < ch.length; j++) {
                start = i;
                end = j;
                if(isPlaindrome(start, end, ch)) {
                    if(max < (end - start) + 1) {
                        max = (end - start) + 1;
                        resstart = i;
                        resend = j + 1;
                    }
                }
            }
        }

        String ans = new String(ch, resstart, resend - resstart);
        return ans;
    }
}
