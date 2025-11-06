import java.util.*;
import java.io.*;
public class _18_1881A_dontcount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim()); // no. of testcases

        while (t-- > 0) {
            String parts[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]); // length of string 1
            int m = Integer.parseInt(parts[1]); // length of string 2
            StringBuilder x = new StringBuilder(br.readLine().trim());
            String s = br.readLine().trim();

            if(x.toString().contains(s)) {
                sb.append("0\n");
                continue;
            }

            int count = 0;
            boolean flag = false;
            for (int i = 0; i < 5; i++) {
                x.append(x);
                count++;
                if(x.toString().contains(s)) {
                    sb.append(count).append("\n");
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                sb.append("-1\n");
            }
        }
        System.out.println(sb.toString());
    }
}
//its for sure if we append x to itself 5 times it will have max length to contain s, just check after every append
