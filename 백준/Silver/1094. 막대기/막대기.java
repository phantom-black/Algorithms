import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int stickCount = 0;

        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                X -= stick; // X에서 사용한 stick 길이만큼 빼주기
                stickCount++;
            }
        }

        // int값을 String으로 변환해서 출력
        bw.write(String.valueOf(stickCount));
        // BufferedWriter는 사용한 뒤 flush() - 남은 값 모두 출력, close()로 닫아줘야 함
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
