public class _37 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 7 || j == 0 || j == i){
                    System.out.print(0);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
