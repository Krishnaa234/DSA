//A and B are good friend and programmers. They are always in a healthy competition with each other. 
//They decide to judge the best among them by competing. They do so by comparing their three skills as per their values. 
//Please help them doing so as they are busy.

class Comparing_two_array_elements {
    public void scores(long a[], long b[]) {
        
        long A=0, B=0;
        for(int i=0; i<b.length; i++) {
            if(a[i]>b[i])
                A++;
            if(a[i]<b[i])
                B++;
        }
        GFG.ca = A;
        GFG.cb = B;
    }
}
