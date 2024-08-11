public class sum {
    public static void main(String[] args) {
        System.out.println(additon(5));   
    }
    static long additon(int n){
        if(n <= 1) {
            return 0;
        }
        return n*n*n + additon(n-1);
    }
    
}
