import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String N = input[0];
        int B = Integer.parseInt(input[1]);

        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
            int value = Character.getNumericValue(N.charAt(i));
            sum = sum * B + value;
        }

        System.out.println(sum);
        br.close();
    }
}
