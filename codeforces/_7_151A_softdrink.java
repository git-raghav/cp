import java.util.Scanner;
public class _7_151A_softdrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of friends
        int k = sc.nextInt();  // number of bottles
        int l = sc.nextInt();  // milliliters per bottle
        int c = sc.nextInt();  // number of limes
        int d = sc.nextInt();  // slices per lime
        int p = sc.nextInt();  // grams of salt
        int nl = sc.nextInt(); // drink per toast
        int np = sc.nextInt(); // salt per toast

        int totalDrinkToasts = (k * l) / nl;
        int totalLimeToasts = c * d;
        int totalSaltToasts = p / np;

        int totalToasts = Math.min(totalDrinkToasts, Math.min(totalLimeToasts, totalSaltToasts));

        System.out.println(totalToasts / n);
    }
}
//brute force, implementation
