public class _18 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 5; j >=0; j--) {
                if (i == 0 || i == 6){
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
