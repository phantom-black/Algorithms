import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // |w-x|, |y-h|, x, y 크기 비교 후 가장 작은 값 출력해야 함

        // 절댓값 구하기 Math.abs(a)
        // a는 double, float, int, long 타입 가능

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" "); // x, y, w, h
        br.close();

        ArrayList<Integer> intArr = new ArrayList<>();

        intArr.add(Integer.parseInt(strArr[0]));
        intArr.add(Integer.parseInt(strArr[1]));
        intArr.add(Math.abs(Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2])));
        intArr.add(Math.abs(Integer.parseInt(strArr[1]) - Integer.parseInt(strArr[3])));

        intArr.sort(Integer::compareTo);

        System.out.print((intArr.get(0)));
    }
}