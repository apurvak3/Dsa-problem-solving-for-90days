package twentyFourJuly;

public class ReverseNumber {
    public static void main(String[] args) {
        
        reverseDigit(12344);
    }

    private static void reverseDigit(int i) {
      int reversed = 0;
      while(i !=0){
        int pop = i % 10;
        i /= 10;
        reversed = reversed * 10 + pop;
      }
      System.out.println(reversed);

      
    }

   
    
}
