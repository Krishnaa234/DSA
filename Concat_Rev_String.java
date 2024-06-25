//Java String | Set 1
//GFG

class Concat_Rev_String {
    static String conRevstr(String S1, String S2) {
        
        StringBuffer sb = new StringBuffer(S1.concat(S2));
        sb.reverse();
        return sb.toString();
    }
}
