//Count type of Characters
//GFG question

class Type_of_char
{
    int[] count (String s)
    {
        // your code here   
        int[] val = new int[4];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                val[0]++;
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
                val[1]++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                val[2]++;
            else
                val[3]++;
        }
        return val;
    }
}
