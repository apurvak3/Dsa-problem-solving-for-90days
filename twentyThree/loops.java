package twentyThree;

public class loops {
    public static void main(String[] args) {
       
        int n= 6;
       System.out.println( n + fibonacci(n));
    }
    public static int fibonacci(int n){
      if(n==1 || n ==2){
        return 1;
      }else {
      int   a =1;
       int  b=1;
       int fibo =1 ;
       for(int i = 3 ;i<=n ; i++){
        fibo = a +b;
        a = b;
        b= fibo;
       }
       return fibo;

      }
    }
}
