import java.util.Scanner;
public class _6_263A_beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int col = 0;
        boolean found = false;
        for (int i = 1; i <= 5 && !found; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                    found = true;
                    break;
                }
            }
        }
        System.out.println(Math.abs(3 - row) + Math.abs(3 - col)); //manhattan dist |x1-x2 + y1-y2|
    }
}
