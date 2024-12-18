import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        int n1, n2;
        while(true) {
            s = br.readLine();
            n1 = Integer.parseInt(s.split(" ")[0]);
            n2 = Integer.parseInt(s.split(" ")[1]);
            if(n1 == 0 && n2 == 0) break;
            if(n1 / n2 > 0 && n1 % n2 == 0) {
                bw.write("multiple\n");
            } else if(n2 / n1 > 0 && n2 % n1 == 0) {
                bw.write("factor\n");
            } else {
                bw.write("neither\n");
            }
        }
        br.close();
        bw.close();
    }
}