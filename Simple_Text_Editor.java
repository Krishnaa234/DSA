import java.io.*;
import java.util.*;

public class Simple_Text_Editor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        sc.nextLine();
        String s="";

        for (int i = 0; i < n; i++) {
            String sr = sc.nextLine();
            String[] str = sr.split(" ");
            String op = str[0];
            
            if (op.equals("1")) {
                s = s + str[1];
                st.push(s);
            }
            else if (op.equals("2")) {
                int k = Integer.parseInt(str[1]);
                String p = st.peek();
                s = p.substring(0, p.length() - k);
                st.push(s);
            }
            else if (op.equals("3")) {
                int k = Integer.parseInt(str[1]);
                String p = st.peek();
                System.out.println(p.charAt(k-1));
            } 
            else {
                st.pop();
                if (!st.empty()) {
                    s = st.peek();
                } else {
                    s = "";
                }
            }
        }
    }
}
