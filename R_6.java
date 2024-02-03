public class R_6 {
    public static void main(String[] args) {
        System.out.println(sum(7));
    }
    public static int sum(int n){
        int total=0;
        for (int i = 0; i < n; i++) {
            if (i %2== 1) {
                total=total+i;

            }

        }
        return total;
    }
}
