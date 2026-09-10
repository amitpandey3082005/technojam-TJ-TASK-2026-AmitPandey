
public class binary {

    public static int concateBinarySum(int n) {
        long MOD = 998244353L; // give in problem 
        long result = 0; // consider result variale with 0 

        int binaryLength = 1;  // since number start with 1 so alwys first term will have 1 bit   
        int nextPowerOf2 = 2;  // to convert binary power increases (2^0,2^1,2^2...)   

        for (int i = 1; i <= n; i++) {
            // check power 2 ir not  
            if (i == nextPowerOf2) {
                binaryLength++;
                nextPowerOf2 <<= 1; // calculate next power 2 (i.e. left shift by 1 and store in nextPowerOf2)      
            }

            result = ((result << binaryLength) + i) % MOD; // ensuring mod to prevent overflow of the integer 
        }

        return (int) result; // typecasting it to the the integer formte for readable 
    }

    public static void main(String[] args) {
        int n = 3; // it will include concat binarys number 1,2,3
        System.out.println(concateBinarySum(n)); // Output: 27
    }
}
