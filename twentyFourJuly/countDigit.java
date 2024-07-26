package twentyFourJuly;

public class countDigit {
    
        static int evenlyDivides(int N) {
            int count = 0;
            int originalN = N; // Store the original value of N
    
            while (N > 0) {
                int digit = N % 10;
                if (digit != 0 && originalN % digit == 0) {
                    count++;
                }
                N /= 10;
            }
            return count;
        }
    
    
}
