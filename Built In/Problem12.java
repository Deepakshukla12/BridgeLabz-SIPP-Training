import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = toFahrenheit(c);
        double c2 = toCelsius(f);
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
