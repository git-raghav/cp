import java.util.*;
import java.io.*;
public class _22_1866A_kid {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            String line1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(line1[0]); //
            int k = Integer.parseInt(line1[1]); //
            String line2[] = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line2[i]);
            }

        }
        System.out.println(sb.toString());
    }
}
