import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();
        int N = Integer.parseInt(s.split(" ")[0]);
        int K = Integer.parseInt(s.split(" ")[1]);

        int cnt = 0;
        int answer = 0;

        for(int i = 1; i <= N; i++) {
            if(N % i == 0) cnt++;
            if(cnt == K) {
                answer = i;
                break;
            }
        }

        if(cnt == K) {
            bw.write(String.valueOf(answer));
        } else {
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}