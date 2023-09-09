public class _79 {
    public static void main(String[] args) {
        for (int i = 97; i <= 104; i++) {
            for (int j = 97; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 104-i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}
