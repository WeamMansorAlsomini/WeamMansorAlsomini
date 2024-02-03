public class R_7 {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    public static int sum (int n){
        int total =0 ;
        for (int i = 0; i < n; i++) {
            int w = i*i;
            total=total+w;

        }
        return total;
    }
}
