package twentyThree;

public class function {
    public static void main(String[] args) {
        int[] result = passedBy(5, 10);
        System.out.println("a: " + result[0] + ", b: " + result[1]); // Expected output: a: 6, b: 12
    }
    
        int value; // Adding this field to store the value for passByReference
    
        // Method to simulate pass by value
        static int passByValue(int a) {
            a = a + 1;
            return a;
        }
    
        // Method to simulate pass by reference
        static void passByReference(function obj) {
            obj.value = obj.value + 2;
        }
    
        static int[] passedBy(int a, int b) {
            a = passByValue(a);
            
            function abc = new function();
            abc.value = b;
            passByReference(abc);
    
            return new int[]{a, abc.value};
        }
    
        
    }
    
    

