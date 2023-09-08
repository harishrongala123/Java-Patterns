public class _69 {
    public static void main(String[] args) {
        char c = 'Z';
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
}
