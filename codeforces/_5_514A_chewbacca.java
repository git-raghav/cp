import java.util.Scanner;
public class _5_514A_chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        // handling 1st digit
        int firstDigit = s.charAt(0) - '0';
        if (firstDigit != 9 && firstDigit >= 5) {
            sb.append(9 - firstDigit);
        } else {
            sb.append(firstDigit);
        }

        // rest digits
        for (int i = 1; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit >= 5) {
                sb.append(9 - digit);
            } else {
                sb.append(digit);
            }
        }
        System.out.println(sb.toString());
    }
}
//if digit is >=5 then only 9-digit will give a no. smaller then the original digit
//brute force
