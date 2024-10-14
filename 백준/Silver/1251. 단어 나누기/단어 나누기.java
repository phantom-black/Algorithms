import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String tmp;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i < str.length() - 1; i++) {
            for(int j = i + 1; j < str.length(); j++) {
                tmp = getReversedString(str, i, j);
                list.add(tmp);
            }
        }

        Collections.sort(list);
        bw.write(list.get(0));

        bw.flush();
        bw.close();
        br.close();
    }

    public static String getReversedString(String str, int i, int j) {
        StringBuilder sb1 = new StringBuilder(str.substring(0, i));
        StringBuilder sb2 = new StringBuilder(str.substring(i, j));
        StringBuilder sb3 = new StringBuilder(str.substring(j));

        StringBuilder sb = new StringBuilder();
        sb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
        return sb.toString();
    }
}
