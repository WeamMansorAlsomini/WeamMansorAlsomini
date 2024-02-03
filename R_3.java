public class R_3 {
    public static void main(String[] args) {
        System.out.println(isMultiple(20,10));
    }
    public static boolean  isMultiple(long n ,long m){
        if(n % m==0)
            return true;
        else
            return false;

    }

}
