import java.util.*;
import java.io.*;
public class _16_2167C_isamatdin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String parts[] = br.readLine().split(" ");
            int arr[] = new int[n];
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even > 0 && odd > 0) {
                Arrays.sort(arr);
            }
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(i == n-1 ? "\n" : " ");
            }
        }
        System.out.println(sb.toString());
    }
}
//if contains both even and odd no.then we can sort the array so return the sorted array else return the original array
