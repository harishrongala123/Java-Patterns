public class _40 {
    public static void main(String[] args) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i){
                    System.out.print(0);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
