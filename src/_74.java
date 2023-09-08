public class _74 {
    public static void main(String[] args) {
        int a = 7;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7-i; j++) {
                System.out.print(a);
            }
            a--;
            System.out.println();
        }
    }
}
