import java.util.*;
import java.io.*;
public class _19_1878A_daytona {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]); // length of array
            int k = Integer.parseInt(parts[1]); // element that must be most common
            String parts2[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts2[i]);
            }
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == k) {
                    sb.append("YES\n");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }
}
