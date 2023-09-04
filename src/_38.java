public class _38 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j >= 0; j--) {
                if (i == 0 || j == 0 || i == 6 || j == i){
                    System.out.print(0);
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
