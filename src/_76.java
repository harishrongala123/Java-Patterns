public class _76 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 7; j>i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
