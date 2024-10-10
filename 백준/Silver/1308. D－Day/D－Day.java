import java.util.Scanner;

public class Main {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // 400으로 나누어 떨어지면 윤년
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static long calculateDaysBetween(int y1, int m1, int d1, int y2, int m2, int d2) {
        long totalDays = 0;

        while (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 < d2)) {
            totalDays++;
            d1++;
            if (d1 > getDaysInMonth(y1, m1)) {
                d1 = 1;
                m1++;
                if (m1 > 12) {
                    m1 = 1;
                    y1++;
                }
            }
        }
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearToday = scanner.nextInt();
        int monthToday = scanner.nextInt();
        int dayToday = scanner.nextInt();

        int yearDday = scanner.nextInt();
        int monthDday = scanner.nextInt();
        int dayDday = scanner.nextInt();

        if (yearDday > yearToday + 1000 ||
                (yearDday == yearToday + 1000 && (monthDday > monthToday ||
                        (monthDday == monthToday && dayDday >= dayToday)))) {
            System.out.println("gg");
        } else {
            long daysBetween = calculateDaysBetween(yearToday, monthToday, dayToday, yearDday, monthDday, dayDday);
            System.out.println("D-" + daysBetween);
        }

        scanner.close();
    }
}
