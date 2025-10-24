import java.util.*;
import java.io.*;
public class _9_1901A_linetrip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]); // no. of gas stations
            int x = Integer.parseInt(firstLine[1]); // destination

            String[] parts = br.readLine().split(" ");
            int[] stations = new int[n+1];
            stations[0] = 0;
            for (int i = 1; i <= n; i++) {
                stations[i] = Integer.parseInt(parts[i-1]);
            }

            int dist = 0;
            for (int i = 0; i < stations.length - 1; i++) {
                dist = Math.max(dist, stations[i+1] - stations[i]);
            }
            sb.append(Math.max(dist, 2*(x-stations[stations.length-1]))+"\n");
        }
        System.out.println(sb.toString());
    }
}
