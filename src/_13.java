public class _13 {
    public static void main(String[] args) {
        int a = 7;
        for (int i = 0; i < 3; i++) {
            for (int j = a; j >i+1; j--) {
                System.out.print(j);
            }
            a++;
            System.out.println();
        }
    }
}
