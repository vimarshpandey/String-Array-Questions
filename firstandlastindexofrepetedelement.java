public class firstandlastindexofrepetedelement {
    public static void main(String[] args) {
        String s = "mabmmmmm";
        char[] ch = s.toCharArray();
        int start = -1;
        int end = -1;

        for(int i = 1; i < ch.length; i++) {
            if(ch[i] == ch[i - 1]) {
                if(start == -1) {
                    start = i - 1;
                }
                end = i;
            }
        }

        if(start != -1) {
            System.out.println("First: " + start + " Last: " + end);
        } else {
            System.out.println("No repeted element found");
        }
    }
}