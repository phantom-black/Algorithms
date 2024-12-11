import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int layer = 1;
        int lastRoom = 1;

        while (N > lastRoom) {
            lastRoom += 6 * layer; // 각 층에서 방 수가 6의 배수로 증가
            layer++;
        }

        System.out.println(layer);
    }
}