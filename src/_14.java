public class _14 {
    public static void main(String[] args) {
        int a = 7;
        for (int i = 3; i > 0; i--) {
            for (int j = a; j >= i; j--) {
                System.out.print(j);
            }
            a--;
            System.out.println();
        }
    }
}
