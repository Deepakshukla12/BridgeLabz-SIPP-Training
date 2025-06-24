import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        String op = sc.next();
        int result = 0;
        if (op.equals("+")) result = add(a, b);
        else if (op.equals("-")) result = subtract(a, b);
        else if (op.equals("*")) result = multiply(a, b);
        else if (op.equals("/")) result = divide(a, b);
    }

    static int add(int x, int y) { return x + y; }
    static int subtract(int x, int y) { return x - y; }
    static int multiply(int x, int y) { return x * y; }
    static int divide(int x, int y) { return y != 0 ? x / y : 0; }
}
