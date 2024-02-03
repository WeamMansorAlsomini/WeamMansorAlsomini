import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        mymethod();


    }
    public static void mymethod(){
        int[] A=new int[3];
        Scanner enter =new Scanner(System.in);
        for (int i = 0; i <A.length; i++) {
           A[i]=enter.nextInt();

        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);

        }
    }
}
