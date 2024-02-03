import java.util.Scanner;

public class R4 {
    public static void main(String[] args) {
        int[]M=new int[3];
        Scanner enter =new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            M[i]=enter.nextInt();
            System.out.println(M[i]);
        }

    }
}
