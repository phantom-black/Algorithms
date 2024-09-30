import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int stick = 64;  // 초기 막대 길이
        int stickCount = 0;

        while (X > 0) {
            if (stick > X) {
                stick /= 2; // 현재 막대 길이가 목표보다 크면 반으로 줄임
            } else {
                X -= stick; // 막대를 사용하고 목표 길이에서 빼줌
                stickCount++; // 막대 카운트 증가
            }
        }

        bw.write(String.valueOf(stickCount)); // stickCount 출력
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
