public class _59 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if(i == 4 || j == 0){
                    System.out.print(0);
                }else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
