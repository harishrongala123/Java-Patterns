public class _12 {
    public static void main(String[] args) {
        int a = 7;
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j <= a; j++) {
                System.out.print(j);
            }
            a++;
            System.out.println();
        }
    }
}
