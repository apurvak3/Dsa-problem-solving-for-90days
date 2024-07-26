package twentyFourJuly;

public class GCD {
    
        static Long[] lcmAndGcd(Long A , Long B) {
            Long[] result = new Long[2];
    
            // Calculate GCD
            Long gcd = gcd(A, B);
    
            // Calculate LCM
            Long lcm = (A * B) / gcd;
    
            // Store results
            result[0] = lcm;
            result[1] = gcd;
            return result;
        }
    
        // Helper function to calculate GCD using Euclidean algorithm
        static Long gcd(Long a, Long b) {
            while (b != 0) {
                Long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
    
    

