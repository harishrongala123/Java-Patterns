public class _87 {
    public static void main(String[] args) {
        for (int i = 70; i >= 65; i--) {
            for (int j = 65; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 65+ 70-i; j >= 65; j--) {
                if(j == 65+ 70-i || j == 65|| i == 65){
                    System.out.print((char)j+ " ");
                }else
                    System.out.print(0+ " ");
            }
            System.out.println();
        }
    }
}
