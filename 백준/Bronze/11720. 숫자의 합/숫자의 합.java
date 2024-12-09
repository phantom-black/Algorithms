import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        int sum = 0;
        for (byte value : str.getBytes()) {
            sum += value - '0';
        }
        System.out.println(sum);
        br.close();
    }
}