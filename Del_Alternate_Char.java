//Delete alternate characters
//GFG DSA
class Del_Alternate_Char {
    static String delAlternate(String S) {
        // code here
        
        StringBuffer res = new StringBuffer();
        for(int i = 0; i< S.length(); i=i+2){
            res.append(S.charAt(i));
        }
        return res.toString();
    }
}
