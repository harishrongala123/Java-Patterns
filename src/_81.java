public class _81 {
    public static void main(String[] args) {
        for (int i = 8; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
