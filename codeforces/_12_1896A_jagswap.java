import java.util.*;
import java.io.*;
public class _12_1896A_jagswap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // size of permutation
            String parts[] = br.readLine().split(" ");
            if(parts[0].equals("1")) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
