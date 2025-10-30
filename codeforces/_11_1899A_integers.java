import java.util.*;
import java.io.*;
public class _11_1899A_integers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // integer

            if(n % 3 == 0) {
                sb.append("Second").append("\n");
            } else {
                sb.append("First").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
