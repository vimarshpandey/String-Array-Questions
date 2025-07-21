public class cocubes1 {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += Math.pow(2, i) + GCD(i, n);
        }

        System.out.println(sum);
    }

    public static int GCD(int x, int y) {
        int val = Math.min(x, y);
        int res = 1;

        for(int i = 1; i <= val; i++) {
            if(x % i == 0 && y % i == 0) {
                res = i;
            }
        }

        return res;
    }
}
