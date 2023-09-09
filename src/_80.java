public class _80 {
    public static void main(String[] args) {
        for (int i = 80; i <= 87; i++) {
            for (int j = 80; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 80; j <80+ 87-i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
