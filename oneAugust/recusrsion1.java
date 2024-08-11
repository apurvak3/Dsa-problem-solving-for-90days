public class recusrsion1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 5){
            return ;
        }else{
        System.out.println(n);
        fun(n-1);
        }
    }
    
}
