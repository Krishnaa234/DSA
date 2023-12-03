//Given an integer, check whether it is a palindrome or not.
class num_Palindrome
{
    public String is_palindrome(int n)
    {
        int N=n;
        int a=0;
        while(N!=0) {
            int rem = N % 10;
            a  = (a *10) + rem;
            N = N /10;
        }
        if(n==a)
            return ("Yes");
        else
            return ("No");
    }
}
