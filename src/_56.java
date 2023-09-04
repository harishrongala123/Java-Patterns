public class _56 {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
               if(i == 5 || j == 0 || j == i){
                   System.out.print(0);
               }else
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
