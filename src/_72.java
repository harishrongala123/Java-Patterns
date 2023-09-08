public class _72 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j < i){
                    System.out.print(" ");
                }else
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
