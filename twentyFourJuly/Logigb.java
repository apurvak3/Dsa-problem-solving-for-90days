package twentyFourJuly;

public class Logigb {
    public static void main(String[] args) {
        int N = 5;
        pattern(4);
    }

    static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

