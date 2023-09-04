public class _36 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 8){
                    System.out.print(0);
                } else if (j == 0 || j == i) {
                    System.out.print(0);
                }else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
