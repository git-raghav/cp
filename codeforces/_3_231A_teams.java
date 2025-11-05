import java.io.*;
public class _3_231A_teams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n-- > 0) {
            String parts[] = br.readLine().split(" ");
            int p = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            int t = Integer.parseInt(parts[2]);

            if (p + v + t >= 2) count++;
        }
        System.out.println(count);
    }
}
//brute force
