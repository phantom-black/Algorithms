import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int X = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);

        long sum = X;
        Queue<Integer> ponixes = new LinkedList<>();

        ponixes.offer(X);

        for(int i = 0; i < M; i++) {
            Queue<Integer> newPonixes = new LinkedList<>();

            while(!ponixes.isEmpty()) {
                int power = ponixes.poll();

                if(power > 0) {
                    int newPower1 = power / 2;
                    int newPower2 = (power + 1) / 2;

                    sum += newPower1 + newPower2;
                    newPonixes.offer(newPower1);
                    newPonixes.offer(newPower2);
                }
            }

            ponixes = newPonixes;
        }

        bw.write(Long.toString(sum));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
