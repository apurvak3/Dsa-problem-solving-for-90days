package twentyFourJuly.logicBuiding;

public class ques1 {
    public static void main(String[] args) {
        int N = 6;
        pattern(4);
    }

    static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

