import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int n = Integer.parseInt(str.split(" ")[0]);
        char d = str.split(" ")[1].charAt(0);

        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            String tmp = String.valueOf(i);

            for(char c : tmp.toCharArray()) {
               if(c == d) {
                   cnt++;
               }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}