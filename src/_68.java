public class _68 {
    public static void main(String[] args) {
        char currentChar = 'L';

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }
}
