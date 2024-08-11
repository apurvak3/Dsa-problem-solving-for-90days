public class factorial {
    public static void main(String[] args) {
        factorialNumber(5);
        System.out.println(factorialNumber(9));
    }

     static int factorialNumber(int x) {
         int ans = 1;
         for(int i = 0 ;i< x ; i++){
            ans = ans * i ;

         }
         return ans;
    }
    

}
