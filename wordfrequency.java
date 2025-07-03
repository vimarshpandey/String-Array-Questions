public class wordfrequency {
    public static void main(String[] args) {
        String s = "vimarsh is a good boy abhishek is also a good boy and and he is also a friend of vimarsh";
        String[] str = s.split(" ");

        boolean[] counted = new boolean[str.length];

        for(int i = 0; i < str.length; i++) {
            if(!counted[i]) {
                int count = 1;
                for(int j = i + 1; j < str.length; j++) {
                    if(str[i].equals(str[j])) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(str[i] + " : " + count);
            }
        }
    }
}
