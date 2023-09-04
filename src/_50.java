public class _50 {
    public static void main(String[] args) {
        for (int i = 80; i < 85; i++) {
            for (int j = i; j >= 80; j--) {
                if(j == i || j == 80) {
                    System.out.print((char) j);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
}
