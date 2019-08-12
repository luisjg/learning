import java.lang.StringBuilder;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] exploded = s.trim().split("\\s+");
        for(int i = exploded.length - 1; i>=0; i--) {
            if (i != 0) 
                sb.append(exploded[i] + " ");
            else
                sb.append(exploded[i]);
        }
        
        return sb.toString();
    }
}