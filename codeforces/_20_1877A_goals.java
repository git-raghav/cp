import java.util.*;
import java.io.*;
public class _20_1877A_goals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // no. of teams
            String line[] = br.readLine().trim().split(" ");
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum += Integer.parseInt(line[i]);
            }
            sum = -sum;
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}
//sum of all should be 0 so sum + x = 0;
// subtract from 0 is just switching signs so sum = -sum
