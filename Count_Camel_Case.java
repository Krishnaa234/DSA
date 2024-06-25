//Count Camel Case
//GFG

class Count_Camel_Case
{
    int countCamelCase (String s)
    {
          
        int ca=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                ca++;
        }
        return ca;
    }
}
