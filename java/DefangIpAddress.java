import java.lang.StringBuilder;

public class DefangIpAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] addrArray = address.toCharArray();
        for(int i=0; i<addrArray.length; i++) {
            if (addrArray[i] == '.') {
                sb.append("[.]");
            } else {
                sb.append(addrArray[i]);
            }
        }
        return sb.toString();
    }
}