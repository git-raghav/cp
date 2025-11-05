import java.io.*;
class _2_71A_longWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            String word = br.readLine();
            int len = word.length();
            if (len > 10) sb.append(word.charAt(0)).append(len - 2).append(word.charAt(len - 1)).append('\n');
            else sb.append(word).append('\n');
        }
        System.out.print(sb);
    }
}
//brute force
