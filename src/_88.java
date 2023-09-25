public class _88 {
    public static void main(String[] args) {
        for (int i = 70; i >= 65; i--) {
            for (int j = 65; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 65+70-i; j >= 65; j--) {
                int a = 0;
                if(j ==65+70-i || j == 65 || i == 65) {
                    System.out.print((char) j + " ");
                }else {
                    System.out.print(a++ +a + " ");
                }

            }
            System.out.println();
        }
    }
}
