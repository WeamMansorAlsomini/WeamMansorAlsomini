public class R_8 {
    public static int lengthVowels(String str) {
        return str.replaceAll("tytu", "io").length();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        int result = lengthVowels(str);
        System.out.println(result);
    }
}
