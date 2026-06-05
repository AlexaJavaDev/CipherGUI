public class Cipher {
    public static void main(String[] args) {
        String str = "";
        String enc = encrypt(str);
        System.out.println(str + " " + enc + " " + decrypt(enc));
    }

    public static String encrypt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'z') c = 'a';
                else c = (char) (c + 1);
            }
            else if (c >= 'A' && c <= 'Z') {
                if (c == 'Z') c = 'A';
                else c = (char) (c + 1);
            }
            result += c;
        }
        return result;
    }

    public static String decrypt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'a') c = 'z';
                else c = (char) (c - 1);
            }
            else if (c >= 'A' && c <= 'Z') {
                if (c == 'A') c = 'Z';
                else c = (char) (c - 1);
            }
            result += c;
        }
        return result;
    }
}
