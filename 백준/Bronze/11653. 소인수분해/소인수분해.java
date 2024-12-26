import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        if(N > 1) {
            int num = N;
            int temp;
            while(true) {
                temp = factorize(num);
                if(temp == num) {
                    System.out.print(num);
                    break;
                } else {
                    num = temp;
                }
            }
        }
    }

    public static int factorize(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                return n / i;
            }
        }
        return n;
    }
}