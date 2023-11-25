// For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of 
// three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
// Return "Yes" if it is a armstrong number else return "No".
// NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
  
class ArmstrongNumber {
    static String armstrongNumber(int n){
        int num = n, sum=0;
        while(num>0) {
            int r = num%10;
            sum = sum + (r*r*r);
            num = num /10;
        }
        if(sum == n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
