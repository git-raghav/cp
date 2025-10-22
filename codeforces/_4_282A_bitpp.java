import java.io.*;
public class _4_282A_bitpp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        while (n-- > 0) {
            String str = br.readLine();
            if(str.contains("++")){
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
