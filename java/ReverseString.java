public class ReverseString {
    public void reverseString(char[] s) {
        
        int arrayLength = s.length-1;
        
        for (int i=0; i<=arrayLength; i++) {
            char temp = s[i];
            s[i] = s[arrayLength];
            s[arrayLength] = temp;
            arrayLength--;
        }
    }
}