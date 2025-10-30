import java.util.*;
import java.io.*;
public class _13_1890A_doremy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // length of array
            String parts[] = br.readLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            
        }
        System.out.println(sb.toString());
    }
}
