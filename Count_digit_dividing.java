/*Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
*/
class Count_digit_dividing{
    static int evenlyDivides(int N){
        int s = N;
        if (N == 0) {
            return 0;
        }
        int rem;
        int count = 0;
        while (N != 0) {
            rem = N % 10;
            if (rem != 0 && s % rem == 0) {
                count++;
            }
            N = N / 10;
        }
        return count;
    }
}
