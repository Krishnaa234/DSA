//Java Substring
//GFG

class Java_Substring {
    static String javaSub(String S, int L, int R) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        for(int i=L; i<=R; i++) {
            sb.append(S.charAt(i));
        }
        String s1 = sb.toString();
        return s1;
    }
}
