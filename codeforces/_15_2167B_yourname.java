import java.util.*;
import java.io.*;
public class _15_2167B_yourname {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String parts[] = br.readLine().split(" ");
            char arr1[] = new char[n];
            char arr2[] = new char[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = parts[0].charAt(i);
                arr2[i] = parts[1].charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
