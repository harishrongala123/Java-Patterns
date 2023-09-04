public class _41 {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            for (int j = i; j <= 7; j++) {
                if (j > 6){
                    System.out.print(0);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
