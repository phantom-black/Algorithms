import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        int layer = 1;
        int denominator = 1; // 분모
        int numerator = 1; // 분자

        while(true) {
            if(X < 1) break;
            if(layer % 2 == 0) {
                denominator = layer;
                numerator = 1;
            } else {
                denominator = 1;
                numerator = layer;
            }
            X--;
            for(int i = 1; i < layer; i++) {
                if(X < 1) break;
                if(layer % 2 == 0) {
                    denominator--;
                    numerator++;
                } else {
                    denominator++;
                    numerator--;
                }
                X--;
            }
            layer++;
        }

        System.out.printf("%d/%d", numerator, denominator);
    }
}