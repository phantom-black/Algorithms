import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int pNum = 2;

        for (int i = 1; i <= N; i++) {
            pNum += (pNum - 1);
        }

        System.out.println((int) Math.pow(pNum, 2));
    }
}
