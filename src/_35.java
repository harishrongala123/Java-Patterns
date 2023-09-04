public class _35 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 7) {
                    System.out.print(1);
                } else if (j == 0|| j == i) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
