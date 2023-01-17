package methoduas2



public class methoduas2 {
    public static String reverseAndReplaceVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            char c = kalimat.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||  {
                    sb.append("*");
                } else {
                sb.append(c);
            }
        }
        return sb.toString();


}
