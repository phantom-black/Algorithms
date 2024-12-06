import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int C = Integer.parseInt(br.readLine()); // 0<=C<=500
            int Quarter = C / 25; // 25
            C = C % 25;
            int Dime = C / 10; // 10
            C = C % 10;
            int Nickel = C / 5; // 5
            int Penny = C % 5; // 1
            sb.append(Quarter);
            sb.append(" ");
            sb.append(Dime);
            sb.append(" ");
            sb.append(Nickel);
            sb.append(" ");
            sb.append(Penny);
            if(T > 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}