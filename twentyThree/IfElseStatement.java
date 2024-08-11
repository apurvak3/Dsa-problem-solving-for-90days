//
package twentyThree;

public class IfElseStatement {
    
        public static String compareNM(int n, int m) {
            // code here
            if(n < m){
                     return "lesser";
            }else if(n == m){
                    return "equal";
                    
            }else if( n>m){
                        return "greater";
            }else{
                return "none";
            }
        }
        public class Main {
            public static void main(String[] args) {
                System.out.println(IfElseStatement.compareNM(3, 5));  // Output: lesser
                System.out.println(IfElseStatement.compareNM(5, 5));  // Output: equal
                System.out.println(IfElseStatement.compareNM(7, 5));  // Output: greater
            }
        }
        
    }

