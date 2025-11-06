import java.util.*;
import java.io.*;

public class _21_1873C_target {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            int score[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                    { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                    { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
                    { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
                    { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
                    { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
                    { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
                    { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
                    { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
            };
            int totalscore = 0;
            for (int i = 0; i < 10; i++) {
                String line = br.readLine().trim();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        totalscore += score[i][j];
                    }
                }
            }
            sb.append(totalscore).append("\n");
        }
        System.out.println(sb.toString());
    }
}
