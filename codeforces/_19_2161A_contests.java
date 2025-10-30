import java.util.*;
import java.io.*;
public class _19_2161A_contests {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            String parts[] = br.readLine().trim().split(" ");
            int r = Integer.parseInt(parts[0]); //initial rating
            int x = Integer.parseInt(parts[1]); //div 2 threshold
            int d = Integer.parseInt(parts[2]); //rating delta
            int n = Integer.parseInt(parts[3]); //no. of contests
            String s = br.readLine().trim();

            int contests = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if(c == '1') {
                    r = Math.max(0, r - d);
                    contests++;
                } else if(c == '2' && r < x) {
                    r = Math.max(0, r - d);
                    contests++;
                }
            }
            sb.append(contests).append("\n");
        }
        System.out.println(sb.toString());
    }
}
