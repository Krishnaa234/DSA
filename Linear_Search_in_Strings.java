import java.util.*;

public class Linear_Search_in_Strings{
    public static void main(String args[]) {
      
        System.out.print("Enter string: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Enter character: ");
        char key = in.next().charAt(0);
        System.out.println("Target present in the string?: "+ search(name, key));
        System.out.println("Target present in the string? method 2: " + search2(name, key));
        //System.err.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String s, char k) {
        if(s.length() == 0)
            return false;
        
        //method 1
        for(int i=0; i<s.length(); i++) {
            if(k == s.toLowerCase().charAt(i))
                return true;
        }

        return false;
    }

    static boolean search2(String s, char k) {
        if(s.length() == 0)
            return false;
        
        // method 2
        for(char ch : s.toLowerCase().toCharArray())
        {
            if (ch == k)
                return true;
        }
        return false;
    }
}
