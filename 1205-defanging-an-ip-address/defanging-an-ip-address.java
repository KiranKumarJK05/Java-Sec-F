class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address.length() + 6);
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}