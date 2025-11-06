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

            HashMap<Integer, Integer> map = new HashMap<>(); //same elements ki freq store krlo
            for (int i = 0; i < n; i++) {
                map.put(Integer.parseInt(parts[i]), map.getOrDefault(Integer.parseInt(parts[i]), 0) + 1);
            }

            if(map.size() >= 3){ //more then 3 distinct elements
                sb.append("No\n");
                continue;
            }
            ArrayList<Integer> list = new ArrayList<>(map.values());
            if(map.size() == 1 || list.get(0) == list.get(1) || Math.abs(list.get(0) - list.get(1)) == 1){
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.println(sb.toString());
    }
}
//i + i+1 = i+1 + i+2 (sum of adjacent elements should be same as next adjacent pair)
//so i+1 and i+1 will get cancelled therefore i = i+2, ie. every 2nd element should be same
//so if there are 3 or more distinct elements it will not be possible, if only 1 distinct element it will be possible always
//if 2 distinct then if same freq then possible, if diff freq then only possible if diff freq by 1.
