import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        br.close();

        int temp;
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            temp = Integer.parseInt(input[i]);
            if(isPrime(temp)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isPrime(int n) {
        if(n < 2) { return false; }
        if(n == 2) { return true; }
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) { return false; }
        }
        return true;
    }
}