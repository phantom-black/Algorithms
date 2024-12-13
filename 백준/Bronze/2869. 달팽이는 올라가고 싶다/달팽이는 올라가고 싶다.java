import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        int A = Integer.parseInt(s.split(" ")[0]);
        int B = Integer.parseInt(s.split(" ")[1]);
        int V = Integer.parseInt(s.split(" ")[2]);

        int cnt = (int) Math.ceil((double)(V - A) / (A - B)) + 1;

        System.out.print(cnt);
    }
}