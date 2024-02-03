public class R_4 {
    public static void main(String[] args) {
        int num=8;
        System.out.println(Even(num));
    }
    public static boolean Even(int x)

    {
        if((x & 1) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
