//GFG question

class In_Range_array {
    static String isInRange(int N){
        
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        if(N>=1 && N<=10)
            return arr[N-1];
        else 
            return "not in range";
    }
}
