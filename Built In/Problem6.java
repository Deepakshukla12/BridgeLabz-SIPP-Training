import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = findMax(a, b, c);
    }

    static int findMax(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        if (y >= x && y >= z) return y;
        return z;
    }
}
