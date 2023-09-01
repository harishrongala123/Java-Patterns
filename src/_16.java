public class _16 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if( i == 0 || i == 5){
                    System.out.print(0);
                } else if (j == 0 || j == 5) {
                    System.out.print(0);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
