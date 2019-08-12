import java.lang.StringBuilder;

public class RemoveVowelsInString {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<S.length(); i++) {
            switch (S.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                break;
                default:
                    sb.append(S.charAt(i));
                break;
            }
        }
        
        return sb.toString();
    }
}