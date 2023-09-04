public class _55 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                if(i == 0 || j == 5 || j == i ) {
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
