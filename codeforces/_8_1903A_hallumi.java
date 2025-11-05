import java.util.*;
import java.io.*;

public class _8_1903A_hallumi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);

            String[] parts = br.readLine().split(" ");
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(parts[i]);
            }

            long copy[] = Arrays.copyOf(arr, n);
            Arrays.sort(copy);

            if (Arrays.equals(arr, copy) || k > 1) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }
}
//if array is sorted return yes or if k is greater than 1 return yes
//because with atleat 2 elements we can sort any array(bubble sort)
