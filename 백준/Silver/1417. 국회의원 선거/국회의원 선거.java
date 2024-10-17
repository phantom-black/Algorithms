import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()) - 1;
        int[] arr = new int[N];
        int dasom = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        while(true) {
            if(N == 0) break;
            Arrays.sort(arr);    // sort: 오름차순 정렬
            if(arr[N-1] < dasom) break;
            else {
                dasom++;
                arr[N-1]--;
                cnt++;
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
