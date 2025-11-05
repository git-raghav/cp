import java.util.*;
import java.io.*;
public class _10_1900A_coverwater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // no. of testcases

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // no. of cells
            String s = br.readLine(); //cells . if empty and # if blocked

            boolean continuousthree = false;
            int totalempty = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '.' && i+1 < n && s.charAt(i+1) == '.' && i+2 < n && s.charAt(i+2) == '.') {
                    continuousthree = true;
                    break;
                } else if(s.charAt(i) == '.') {
                    totalempty++;
                }
            }

            if(continuousthree){
                sb.append(2).append("\n");
            } else {
                sb.append(totalempty).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
//if at any point there is 3 empty cells then all can be filled by just 2 moves
//else count empty holes
