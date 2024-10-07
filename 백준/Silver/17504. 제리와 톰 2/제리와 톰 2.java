import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] intArr = new int[N];

        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }

        long numerator = 1; // 분자
        long denominator = intArr[N - 1]; // 분모

        for (int i = N - 2; i >= 0; i--) {
            long temp = denominator;
            denominator = intArr[i] * denominator + numerator;
            numerator = temp;
        }

        // 톰이 가지고 있는 치즈의 양 계산 (1 - C)
        long tomCheeseNumerator = denominator - numerator;
        long tomCheeseDenominator = denominator;

        // 기약분수로 만들기
        long gcd = gcd(tomCheeseNumerator, tomCheeseDenominator);
        tomCheeseNumerator /= gcd;
        tomCheeseDenominator /= gcd;

        System.out.println(tomCheeseNumerator + " " + tomCheeseDenominator);
    }

    // 최대 공약수 구하기
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
