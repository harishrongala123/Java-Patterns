public class _84 {
    public static void main(String[] args) {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 7; j++) {
                if(i == j || i == 1|| j == 7){
                    System.out.print(j+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
