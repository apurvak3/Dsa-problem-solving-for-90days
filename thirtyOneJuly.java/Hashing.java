

public class Hashing {
    public static void main(String[] args) {
    
      int N = 10;
      printNos(N);
    }

    private static void printNos(int N) {
        
       if(N> 0){
        printNos(N -1);
        System.out.println(N + " ");
       }
    }

}
