import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for(int i = 0; i < 3; i++) {
            String[] strArr = br.readLine().split(" ");
            xArr[i] = Integer.parseInt(strArr[0]);
            yArr[i] = Integer.parseInt(strArr[1]);
        }

        int xn = findUniqueNum(xArr);
        int yn = findUniqueNum(yArr);

        System.out.println(xn + " " + yn);
    }

    public static int findUniqueNum(int[] intArr) {
        if(intArr[0] == intArr[1]) {
            return intArr[2];
        } else if(intArr[0] == intArr[2]) {
            return intArr[1];
        } else {
            return intArr[0];
        }
    }
}