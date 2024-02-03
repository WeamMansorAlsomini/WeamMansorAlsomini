public class R_9 {
    public static void main(String[] args) {
        String string = "Let's try MiKe";
        System.out.println(remove(string));


    }

    public static String remove(String q) {
        StringBuilder s = new StringBuilder();
        for (char z : q.toCharArray()) {
            if (Character.isLetterOrDigit(z)||Character.isWhitespace(z)) {
                s.append(z);
            }

        }
        return s.toString();

    }
}
