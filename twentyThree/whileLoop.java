package twentyThree;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        
        int i = 10;
        while (i >= 1) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i--;
        }

        // Close the scanner
        s.close();
    }
}

